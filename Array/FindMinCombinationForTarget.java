package Array;

import java.util.HashMap;

public class FindMinCombinationForTarget {
	public static void print3(int[] arr, int target) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    int prefixSum = 0;
	    int minLength = Integer.MAX_VALUE;
	    int minStart = -1;
	    int minEnd = -1;

	    map.put(0, -1); // To handle cases where the subarray starts from index 0

	    for (int i = 0; i < arr.length; i++) {
	        prefixSum += arr[i];

	        if (map.containsKey(prefixSum - target)) {
	            int start = map.get(prefixSum - target) + 1;
	            int length = i - start + 1;

	            if (length < minLength) {
	                minLength = length;
	                minStart = start;
	                minEnd = i;
	            }
	        }

	        map.put(prefixSum, i);
	    }

	    if (minLength == Integer.MAX_VALUE) {
	        System.out.println("No subarray with the given sum found.");
	    } else {
	        System.out.println("Minimum length of subarray with the target sum: " + minLength);
	        System.out.print("Subarray: ");
	        for (int i = minStart; i <= minEnd; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	}
	public static void print2(int[] arr, int target) {
	    int start = 0;
	    int sum = 0;
	    int minLength = Integer.MAX_VALUE;
	    int minStart = -1; // To store the starting index of the minimum length subarray
	    int minEnd = -1;   // To store the ending index of the minimum length subarray

	    for (int end = 0; end < arr.length; end++) {
	        sum += arr[end];

	        // Shrink the window as long as the sum is greater than or equal to the target
	        while (sum >= target) {
	            if (end - start + 1 < minLength) {
	                minLength = end - start + 1;
	                minStart = start;
	                minEnd = end;
	            }

	            // Reduce the window size
	            sum -= arr[start];
	            start++;
	        }
	    }

	    // Output the result
	    if (minLength == Integer.MAX_VALUE) {
	        System.out.println("No subarray with the given sum found.");
	    } else {
	        System.out.println("Minimum length of subarray with the target sum: " + minLength);
	        System.out.print("Subarray: ");
	        for (int i = minStart; i <= minEnd; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	}
	
	public static void print(int arr[],int target) {
		
	int sum=0;
	int minLength=0;
	int length=0;
		for(int i=0;i<arr.length;i++) {
			 sum = sum+arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(sum==target) {
					
				}else if(sum <target) {
					length++;
				}else {
					length--;
				}
			}
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {

		int arr[]= {1,4,3,2,5};
		print3(arr,5);
	}
}

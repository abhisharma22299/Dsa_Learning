package Array;

import java.util.*;

public class NextPermutation {
	/*

 * next Permutation means that we need it get next greater value 
 *  from the given array  
 
 */

	
	public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        if (nextPermutation(arr)) {
            System.out.println("Next Permutation: " + Arrays.toString(arr));
        } else {
            System.out.println("No next permutation. Array is in descending order.");
        }
    }

    public static boolean nextPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: Find the pivot
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If no pivot is found, this is the last permutation
        if (i < 0) {
            return false;
        }

        // Step 2: Find the successor
        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Step 3: Swap pivot and successor
        swap(arr, i, j);

        // Step 4: Reverse the suffix
        reverse(arr, i + 1, n - 1);

        return true;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    
    
    

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}

	

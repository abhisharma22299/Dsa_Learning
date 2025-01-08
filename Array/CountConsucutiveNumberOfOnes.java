package Array;

public class CountConsucutiveNumberOfOnes {
	
	// brute force approach
	 public static int findMaxConsecutiveOnes(int[] nums) {
	        int currSum = 0;
	        int maxSum = 0;

	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] == 0) {
	                currSum = 0;  
	            } else {
	                currSum=0;
	                int j = i ;

	                while (j < nums.length && nums[j] == 1) {
	                    currSum++;
	                    j++;
	                }
	            }
	            maxSum = Math.max(maxSum, currSum);
	        }
	        System.out.println(maxSum);
	        return maxSum;
	    }
	 // optimal approach 
	 public static int findMaxConsecutiveOnes2(int nums[]) {
		 
		 int maxSum =0;
		 int currSum =0;
		 
		 
		 for(int i=0;i<nums.length;i++) {
			 
			 if(nums[i]==1) {
				 currSum++;
			 }
			 else {
				 currSum=0;	 
			 }
			 maxSum=Math.max(maxSum, currSum);
			 
		 }
		 
		 System.out.println(maxSum);
		 return maxSum;
	 }
	 public static void main(String[] args) {
		 
		 int arr[]= {1,0,0,1,1,1,0,1,1,0,0,0,0,0,0};
		 findMaxConsecutiveOnes2(arr);
	}
}

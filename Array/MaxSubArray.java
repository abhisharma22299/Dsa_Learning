package Array;

public class MaxSubArray {

	public static int maxSubArray(int arr[]) {

		int max = 0, currSum = 0;

		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];
			if (currSum < 0) {
				currSum = 0;
			}
			if (currSum > max) {
				max = currSum;
			}
		}
		return max;
	}

	public static int maxSubArray2(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible value
        
        // Iterate through all possible starting indices
        for (int i = 0; i < n; i++) {
            int currentSum = 0; // Reset the sum for the current subarray
            
            // Iterate through all subarrays starting from index `i`
            for (int j = i; j < n; j++) {
                currentSum += nums[j]; // Add the current element to the sum
                maxSum = Math.max(maxSum, currentSum); // Update maxSum if needed
            }
        }
        
        return maxSum;
    }
	public static int maxSubArray3(int[] nums) {
		int n = nums.length;
		int maxSum = Integer.MIN_VALUE;

		// Iterate through all possible subarrays
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int currentSum = 0;
				for (int k = i; k <= j; k++) { // Compute sum from i to j
					currentSum += nums[k];
				}
				maxSum = Math.max(maxSum, currentSum); // Update maxSum if needed
			}
		}

		return maxSum;
	}

	public static void main(String[] args) {

		int arr[] = { -2, 1, 4, -1, 2, 1, -5, 4 };

		System.out.println(maxSubArray3(arr));
	}

}

package Array;

public class RotateArrayKTimes {
	/*
	 * Input: nums = [1,2,3,4,5,6,7], k = 3
	 * 
	 * 1 -> 7 6 5 4 3 2 1 5 6 7 4 3 2 1 5 6 7 1 2 3 4
	 * 
	 * 
	 * 
	 * Output: [5,6,7,1,2,3,4] Explanation: rotate 1 steps to the right:
	 * [7,1,2,3,4,5,6] rotate 2 steps to the right: [6,7,1,2,3,4,5] rotate 3 steps
	 * to the right: [5,6,7,1,2,3,4]
	 */

	public static void print(int[] arr, int k) {
		for (int j = 0; j < k; j++) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
			System.out.print("rotation ");
			for (int a : arr)
				System.out.print(a + " ");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int k = 3;
		print(arr, k);

	}

	public static void rotateArray(int[] arr, int k) {
		int n = arr.length;
		k = k % n; // Handle cases where k > n

		// Reverse the entire array
		reverse(arr, 0, n - 1);

		// Reverse the first k elements
		reverse(arr, 0, k - 1);

		// Reverse the remaining elements
		reverse(arr, k, n - 1);
	}

	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}

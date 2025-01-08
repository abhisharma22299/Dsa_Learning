package Array;

import java.util.Arrays;

public class FirstUniqueElement {
	public static int findFirstUnique(int[] arr) {
		// Sort the array (O(n log n))
		Arrays.sort(arr);

		// Iterate through the sorted array
		for (int i = 0; i < arr.length; i++) {
			// Check if current element is the first and unique element
			if ((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1])) {
				return arr[i];
			}
		}

		// Return -1 if no unique element is found
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 4, 9, 7, 4 };
		int result = findFirstUnique(arr);

		if (result != -1) {
			System.out.println("First unique element: " + result);
		} else {
			System.out.println("No unique element found");
		}
	}
}

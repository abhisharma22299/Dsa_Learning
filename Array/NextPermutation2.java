package Array;

import java.util.Arrays;

public class NextPermutation2 {

	public static void print(int arr[]) {

		int n = arr.length;

		int i = n - 2;

		while (i >= 0 && arr[i] >= arr[i + 1]) {
			i--;
//               1 2 3   
		}

		if (i < 0) {
			System.out.println("invalid");
			System.exit(0);
			return;
		}

		int j = n - 1;
		while (arr[j] <= arr[i]) {
			j--;
		}

		//	
		swap(arr, i, j);

		//

		reverse(arr, i + 1, n - 1);

	}

	public static void reverse(int arr[], int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}

	public static void swap(int arr[], int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };
		print(arr);
		System.out.println(Arrays.toString(arr));
	}
}

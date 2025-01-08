package Array;

public class DeleteEmlement {
	public static void Delete(int[] arr, int e) {
		System.out.print("Before deletion : ");
		for (int ar : arr) {
			System.out.print(ar + " ");

		}
		boolean flag = false;
		int idx = -1;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == e)
				idx = i;
		}
		if (idx != -1) {
			for (int j = idx; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			System.out.println();
			System.out.println("After delerion: ");
			for (int ar = 0; ar < arr.length - 1; ar++) {
				System.out.print(arr[ar] + " ");

			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 34, 5, 23 };

		Delete(arr, 5);
	}
}

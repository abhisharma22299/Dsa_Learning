package SortingTechnique;

public class MergeSort {
	// divide and conquer technique
	public static void conquer(int arr[], int si, int mid, int ei) {
		System.out.println( "in conqure method"+si +" " +ei);
		int merged[] = new int[ei - si + 1];
		int idx1 = si;
		int idx2 = mid + 1;
		int x = 0;
		while (idx1 <= mid && idx2 <= ei) {
			if (arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}
		while (idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		while (idx2 <= ei) {
			merged[x++] = arr[idx2++];
		}
		for (int i = 0, j = si; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}
	}

	public static void mergeSort(int arr[], int si, int ei) {

		if (si >= ei) {
			return;
		}
		System.out.println("int divide "+si +" "+ei );
		int mid = si + (ei - si) / 2; //
		mergeSort(arr, si, mid);
		mergeSort(arr, mid + 1, ei);
		conquer(arr, si, mid, ei);
	}

	public static void main(String[] args) {
		int arr[] = { 6, 1, 9, 5, 2, 8 };
		int n = arr.length;
		mergeSort(arr, 0, n - 1);
		System.out.println();
		for (int ar : arr)
			System.out.print(ar + " ");

	}
}

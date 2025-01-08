package Array;

public class ProductofExceptSelf {
	/*
	 * Given an integer array nums, return an array answer such that answer[i] is
	 * equal to the product of all the elements of nums except nums[i].
	 * 
	 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
	 * integer.
	 * 
	 * You must write an algorithm that runs in O(n) time and without using the
	 * division operation.
	 */
	public static void ProductofExceptSelf(int arr[]) {

		int answer[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int temp = 1;
			for (int j = 0; j < arr.length; j++) {
				if (!(j == i)) {
					temp *= arr[j];
				}
				if (!(temp < 0))
					answer[i] = temp;
			}
		}
		for (int a : answer)
			System.out.print(a + " ");
	}

	public static void ProductofExceptSelfWithOptimal(int arr[]) {

		int answer[] = new int[arr.length];
		int suffix[] = new int[arr.length];
		int prefix[] = new int[arr.length];
		prefix[0] = 1;
		suffix[arr.length - 1] = 1;
		for (int i = 1; i < arr.length; i++) {

			prefix[i] = 1;
			prefix[i] = prefix[i - 1] * arr[i - 1];

		}
		for (int i = arr.length - 2; i >= 0; i--) {
			suffix[i] = 1;
			suffix[i] = suffix[i + 1] * arr[i + 1];

		}
		for (int i = 0; i < arr.length; i++) {
			answer[i] = prefix[i] * suffix[i];
		}

		for (int a : prefix)
			System.out.print(a + " ");

		System.out.println();
		for (int a : suffix)
			System.out.print(a + " ");
		System.out.println();
		for (int a : answer)
			System.out.print(a + " ");

	}

	public static void ProductofExceptSelfWithMostOptimal(int arr[]) {

		int answer[] = new int[arr.length];
		answer[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			answer[i] = 1;

			answer[i] = answer[i - 1] * arr[i - 1];

		}
		int suffix = 1;
		for (int i = arr.length - 2; i >= 0; i--) {
			suffix *= arr[i + 1];
			answer[i] *= suffix;

		}
		for (int a : answer)
			System.out.print(a + " ");

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		ProductofExceptSelfWithMostOptimal(arr);
	}
}

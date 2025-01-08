package Array;

import java.util.ArrayList;

public class RearrangeArrayElementsBySign {
	/*
	 * arr ={1,2,3,-4,-3}; output ={1,-4,2,-3,3};
	 */

	public static void main(String[] args) {
		ArrayList<Integer> postive = new ArrayList<>();

		ArrayList<Integer> negative = new ArrayList<>();

		int arr[] = { 1, 2, 3, -4, -3, 10, 12, };
		for (int n : arr) {
			if (n >= 0)
				postive.add(n);
			else
				negative.add(n);
		}

		ArrayList<Integer> result = new ArrayList<>();
		int posIndex = 0;
		int negIndex = 0;
		while (posIndex < postive.size() && negIndex < negative.size()) {
			result.add(postive.get(posIndex++));
			result.add(negative.get(negIndex++));

		}
		while (posIndex < postive.size()) {
			result.add(postive.get(posIndex++));
		}

		while (negIndex < negative.size()) {
			result.add(negative.get(negIndex++));
		}

		System.out.println(result);

	}

}

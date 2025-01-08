package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeaingAndMissingElement {
	public static void missingElement(int arr[]) {

		int missing = 0;
		int repeating = 0;
		int temp[] = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[arr[i]]++;
		}
		for (int j = 1; j < temp.length; j++) {
			if (temp[j] >= 2) {
				repeating = temp[j];
			}
			if (temp[j] == 0) {
				missing = j;
			}
		}
		System.out.println(missing + " " + repeating);
	}

	public static List<Integer> li(List<Integer> A) {
		int missing = 0;
		int repeating = 0;
		List<Integer> li = new ArrayList<>();
		int temp[] = new int[A.size() + 1];
		for (int i = 0; i < A.size(); i++) {

			temp[A.get(i)]++;
		}
		for (int j = 1; j < temp.length; j++) {
			if (temp[j] >= 2) {
				repeating = temp[j];
			}
			if (temp[j] == 0) {
				missing = j;
			}
		}
		li.add(repeating);
		li.add(missing); 
		return li;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4 };
		List<Integer> list = Arrays.asList(1, 2, 2, 4);
		missingElement(arr);
		List<Integer> li = li(list);
		System.out.println(li);
	}
}

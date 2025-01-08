package geeksforgeeksquestions;

import java.util.Arrays;
import java.util.HashSet;

public class distinctElement {
	public static boolean containsDuplicate(int[] nums) {
		// time complexity is n (log n)
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1])
				return true;
		}
		return false;

	}

	public static boolean containsDuplicate2(int[] nums) {
		// time complexity is n \
		HashSet<Integer> duplicates = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (duplicates.contains(nums[i])) {
				return true;
			}
			duplicates.add(nums[i]);
		}
		return false;
	}

	public static void main(String[] args) {
		int nums[] = { 1, -14, 1, -2, -6, -12 };
		System.out.println(containsDuplicate(nums));
		System.out.println(containsDuplicate2(nums));
	}
}

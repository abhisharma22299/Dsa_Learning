package Array;

import java.util.Arrays;

public class KthElelemt {
	/*
	 * Kth Largest Element in an Array Given an integer array nums and an integer k,
	 * return the kth largest element in the array.
	 * 
	 * Note that it is the kth largest element in the sorted order, not the kth
	 * distinct element.
	 * 
	 * Can you solve it without sorting?
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [3,2,1,5,6,4], k = 2 Output: 5 Example 2:
	 * 
	 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4 Output: 4
	 */

	public static int first(int arr[], int k) {
		Arrays.sort(arr);

		return arr[arr.length-k];
	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 5, 6, 4 };
		System.out.println(first(arr, 2));;
	}
}

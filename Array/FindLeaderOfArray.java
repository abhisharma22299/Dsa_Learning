package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FindLeaderOfArray {

	/*
	 * You are given an array arr of positive integers. Your task is to find all the
	 * leaders in the array. An element is considered a leader if it is greater than
	 * or equal to all elements to its right. The rightmost element is always a
	 * leader. Input: arr = [16, 17, 4, 3, 5, 2] Output: [17, 5, 2] Explanation:
	 * Note that there is nothing greater on the right side of 17, 5 and, 2.
	 */
	
	public static boolean check(int arr[],int j) {
		int temp=arr[j];
		for(int i=j+1;i<arr.length;i++) {
			
			if(temp <arr[i]) {
				return false;
			}
		}
		return true;
	}
	public static ArrayList<Integer> find(int arr[]){
		
		ArrayList<Integer> list =new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(check(arr,i)) {
				list.add(arr[i]);
			}
		}
		
		
		
		System.out.println(list);
		return null;
	}
	public static void findOptimized(int arr[]) {
		  ArrayList<Integer> leaders = new ArrayList<>();
	        int maxFromRight = arr[arr.length - 1];
	        leaders.add(maxFromRight); // The last element is always a leader.

	        // Traverse the array from right to left
	        for (int i = arr.length - 2; i >= 0; i--) {
	            if (arr[i] >= maxFromRight) {
	                maxFromRight = arr[i];
	                leaders.add(maxFromRight);
	            }
	        }
//	        System.out.println(leaders);
	        Collections.reverse(leaders);
	        System.out.println(leaders);
	}
	
	public static void main(String[] args) {

		int arr[]= {16,17,4,3,5,2};
//		ArrayList<Integer> list=find(arr);
		findOptimized(arr);
	}
}

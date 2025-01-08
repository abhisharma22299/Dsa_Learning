package collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Collections;
import java.util.List;

public class ArrayListInCollection {
	public static void printLongestSubString(String s) {

		int i = 0;
		int j = 0;
		int maxLength = 0;
		List<Character> li = new ArrayList<Character>();
 
		while (j < s.length()) {

			if (!(li.contains(s.charAt(j)))) {
				li.add(s.charAt(j));
				j++;
				maxLength = Math.max(maxLength, li.size());
			} else {
				li.remove(i);
				i++;
			}
		}
		System.out.println(maxLength);

	}

	public static void maxSubArray(int[] arr) {

		int currSum=0;
		int maxSum=0;
		
		int i=0;
		while(i<arr.length) {
		currSum +=arr[i];
		if(currSum<0)
			currSum=0;
		if(maxSum<currSum)
			maxSum=currSum;
		i++;
		}
		System.out.println(maxSum);
	}

	public static void main(String[] args) {
//		printLongestSubString("acbsa");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(3);
	
		list.contains(10);
		System.out.println(list);

//		list.remove(2);
//		list.add(2, 1); // index , number
//		Collections.sort(list);

	for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
	}
}

	package Array;

import java.util.HashSet;

public class IntesectionOfArrays {
public static void main(String[] args) {
	HashSet<Integer> set2=new HashSet<Integer>();
	int arr1[] = { 7, 3, 9 };
	int arr2[] = { 6, 3, 9, 2, 9, 4 };
	
	for (int i = 0; i < arr2.length; i++) {
		set2.add(arr2[i]);
	}
	
	System.out.println();
	
	for(int i=0;i<arr1.length;i++) {
		if(set2.contains(arr1[i])) {
			System.out.print(arr1[i]+" ");
		}
	}
}
}

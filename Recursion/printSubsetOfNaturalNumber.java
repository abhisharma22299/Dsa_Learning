package Recursion;

import java.util.ArrayList;
import java.util.Iterator;

public class printSubsetOfNaturalNumber {
	public static void printSubset(ArrayList<Integer> subset) {
		for (int i = 0; i < subset.size(); i++) {
			System.out.print(subset.get(i) + " ");
		}
		System.out.println();
	}

	public static void subset(int n, ArrayList<Integer> subset) {
		if (n == 0) {
			printSubset(subset);
			return;
		}
		subset.add(n);
		subset(n - 1, subset);
         
		subset.remove(subset.size()-1);
		subset(n-1,subset);
	}

	public static void main(String[] args) {
ArrayList<Integer> subset=new ArrayList<Integer>();
subset(3,subset);
	}
}

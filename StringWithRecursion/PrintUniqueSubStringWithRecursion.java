package StringWithRecursion;

import java.util.HashSet;

public class PrintUniqueSubStringWithRecursion {
	public static void printAllSubSequence(String str ,int index,String newString,HashSet<String> set) {
		if(index==str.length()) {
			if(set.contains(newString)) {
				return;
			}
			else {
				System.out.print("{"+newString+"}");
			set.add(newString);
				return;
			}
		}
		char currentChar=str.charAt(index);
		// to be 
		printAllSubSequence(str, index+1, newString+currentChar,set);
		// or not to be
		printAllSubSequence(str, index+1, newString,set);
	}
	
	// Main Function
	public static void main(String[] args) {
		// time complexity O(2^n)
		System.out.print("{");
		HashSet<String> set=new HashSet<>();
		printAllSubSequence("ababa", 0, "",set);
	System.out.print("}");
	}
}

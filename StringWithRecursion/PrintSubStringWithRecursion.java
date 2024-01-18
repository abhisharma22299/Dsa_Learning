package StringWithRecursion;

public class PrintSubStringWithRecursion {
	public static void printAllSubSequence(String str ,int index,String newString) {
		if(index==str.length()) {
			System.out.print("{"+newString+"}");
			return;
		}
		char currentChar=str.charAt(index);
		// to be 
		printAllSubSequence(str, index+1, newString+currentChar);
		// or not to be
		printAllSubSequence(str, index+1, newString);
	}
	
	// Main Function
	public static void main(String[] args) {
		// time complexity O(2^n)
		System.out.print("{");
		printAllSubSequence("12", 0, "");
	System.out.print("}");
	}
}

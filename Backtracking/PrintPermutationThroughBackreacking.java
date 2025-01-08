package Backtracking;

public class PrintPermutationThroughBackreacking {
	// time complexity n*n!
	public static void printPermutation(String str, String Permutaion, int index) {
		if (str.length() == 0) {
			System.out.println(Permutaion);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			String newString = str.substring(0, i) + str.substring(i + 1);
			printPermutation(newString, Permutaion + currentChar, index + 1);

		}

	}

	public static void print(String str, String perm, int indx) {
if(str.length()==0) {
	System.out.println(perm);
	return;
}
		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			String newString =str.substring(0,i)+str.substring(i+1);
			print(newString,perm+currChar,indx++);

		}
	}
//
	public static void print2(String s , String t) {
		if(s.isEmpty()) {
System.out.println(t);
			return;
		}
		else {
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				String newString =s.substring(0,i)+s.substring(i+1);
				print2(newString,t+ch );
			}
		}
		
	}
	public static void main(String[] args) {

		print2("ABC", "");
		// printPattern();

	}

}

package SringWithRecursion;

public class PrintPermutationOfString {

	public static void printPermutation(String str, String permutation) {

		if (str.length() == 0) {
			System.out.println(permutation);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char currentCurr = str.charAt(i);
			// "abc" -> ab
			String newStr = str.substring(0, i) + str.substring(i + 1);
			printPermutation(newStr, permutation + currentCurr);
		}
	}

	public static void main(String[] args) {
		printPermutation("abc", "");
	}
}

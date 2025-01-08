package String;

import java.util.Scanner;

public class ReverseEachWordInAString {
	public static void reverseString(String s) {
	
		String[] str = s.split(" ");

		StringBuilder rev = new StringBuilder();
		for (String w : str) {

			StringBuilder revWord = new StringBuilder(w);
			rev.append(revWord.reverse()).append(" ");

		}

		System.out.println(rev.toString().trim());

	}

	public static void printAllPermutaion(String s, String per) {

		if (s.length() == 0) {
			System.out.println(per);
			return;
		}
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			String newString = s.substring(0, i) + s.substring(i + 1);
			printAllPermutaion(newString, per + ch);

		}

	}

	public static void main(String[] args) {
		reverseString("hello everyone");
		printAllPermutaion("ABC", "");
	}
}

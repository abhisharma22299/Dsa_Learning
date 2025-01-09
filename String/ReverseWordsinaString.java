package String;

public class ReverseWordsinaString {
	/*
	 * Input: s = "a good   example" Output: "example good a" Explanation: You need
	 * to reduce multiple spaces between two words to a single space in the reversed
	 * string.
	 */
	public static String  reverseWords(String s) {
		// Step 1: Trim leading and trailing spaces and split by spaces
		String[] words = s.trim().split("\\s+");

		// Step 2: Use a StringBuilder to reverse the words
		StringBuilder reversed = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]).append(" ");
			
		}
System.out.println(reversed);
		return reversed.toString().trim();
	}

	public static void main(String[] args) {
		reverseWords("example good a");
	}
}

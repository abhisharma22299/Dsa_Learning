package String;

public class MaximumNestingDepthoftheParentheses {
	/*
	 * Given a valid parentheses string s, return the nesting depth of s. The
	 * nesting depth is the maximum number of nested parentheses.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "(1+(2*3)+((8)/4))+1"
	 * 
	 * Output: 3
	 * 
	 * Explanation:
	 * 
	 * Digit 8 is inside of 3 nested parentheses in the string.
	 * 
	 * Example 2:
	 * 
	 * Input: s = "(1)+((2))+(((3)))"
	 * 
	 * Output: 3
	 * 
	 * Explanation:
	 * 
	 * Digit 3 is inside of 3 nested parentheses in the string.
	 * 
	 */

	public static int maxDepth(String s) {
		int maxDepth = 0; // To store the maximum depth
		int currentDepth = 0; // To track the current depth

		for (char c : s.toCharArray()) {
			if (c == '(') {
				currentDepth++; // Increase depth for an opening parenthesis
				maxDepth = Math.max(maxDepth, currentDepth); 
				// Update max depth if needed
			} 
			else if (c == ')') {
				currentDepth--; // Decrease depth for a closing parenthesis
			}
		}

		// If the parentheses are mismatched, `currentDepth` won't be 0 at the end.
		// We assume valid input where parentheses are balanced.
System.out.println(maxDepth);
		return maxDepth;
	}

	public static void main(String[] args) {
		maxDepth("(1+(2*3)+((8)/4))+1");
	}
}

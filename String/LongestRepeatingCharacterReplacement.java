package String;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
	/*
	 * You are given a string s and an integer k. You can choose any character of
	 * the string and change it to any other uppercase English character. You can
	 * perform this operation at most k times.
	 * 
	 * Return the length of the longest substring containing the same letter you can
	 * get after performing the above operations.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "ABAB", k = 2 Output: 4 Explanation: Replace the two 'A's with two
	 * 'B's or vice versa. Example 2:
	 * 
	 * Input: s = "AABABBA", k = 1 Output: 4 Explanation: Replace the one 'A' in the
	 * middle with 'B' and form "AABBBBA". The substring "BBBB" has the longest
	 * repeating letters, which is 4. There may exists other ways to achieve this
	 * answer too.
	 * 
	 */
	public static int characterReplacement(String s, int k) {
		int left = 0;
		int maxLength = 0;
		int maxRepeatCount = 0;
		int len = s.length();
		Map<Character, Integer> map1 = new HashMap<>();

		for (int right = 0; right < len; right++) {
			char curr = s.charAt(right);
			map1.put(curr, map1.getOrDefault(curr, 0) + 1);

			maxRepeatCount = Math.max(maxRepeatCount, map1.get(curr));
			int nonrepeat = (right - left + 1) - maxRepeatCount;

			if (nonrepeat > k) {
				map1.put(s.charAt(left), map1.get(s.charAt(left)) - 1);
				left++;
			}

			maxLength = Math.max(maxLength, right - left + 1);

		}
		return maxLength;
	}

	public static void main(String[] args) {
		System.out.println(characterReplacement("AABABBA", 1));

	}
}

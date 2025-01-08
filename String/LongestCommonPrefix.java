package String;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String s[]) {
		String res = "";
		Arrays.sort(s);
		char[] first = s[0].toCharArray();
		char[] last = s[s.length - 1].toCharArray();

		for (int i = 0; i < first.length; i++) {
			if (first[i] != last[i]) {
				return res;

			}
			res += first[i];
		}
		return res;

	}

	public static void main(String[] args) {
		String s[] = { "a", "as", "asa" };

		System.out.println(longestCommonPrefix(s));

	}
}

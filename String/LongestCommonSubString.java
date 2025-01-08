package String;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubString {
	public static void main(String[] args) {
		String str = "bbbb";
		int i = 0;
		int j = 0;
		int maxLength = 0;
		List<Character> list = new ArrayList<Character>();
		while (j < str.length()) {
			if (!list.contains(str.charAt(j))) {
				list.add(str.charAt(j));
				j++;
				maxLength = Math.max(maxLength, list.size());
			} else {
				list.remove(Character.valueOf(str.charAt(i)));
				i++;
			}
		}
		
		System.out.println(maxLength);
	}
}

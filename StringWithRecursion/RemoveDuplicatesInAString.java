package StringWithRecursion;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInAString {
	public static boolean[] map = new boolean[26];

	private static void removeDuplicatesInString(String str, String newString, int index) {
		if (index == str.length()) {
			System.out.println(newString);
			return;
		}
		char currentChar = str.charAt(index);
		if (map[currentChar - 'a'] == true) {
			
		removeDuplicatesInString(str, newString, index + 1);

		} else {
			newString += currentChar;
			map[currentChar - 'a'] = true;

			removeDuplicatesInString(str, newString, index + 1);
		}

	}
	public static void print(String s ) {
		
		LinkedHashSet<Character> ch =new LinkedHashSet<>();
		
		
		
		for(int i=0;i<s.length();i++) {
			ch.add(s.charAt(i));
			
		}
		
		System.out.println(ch);
		String str=new String();
		for(Character ass:ch) {
			str+=ass;
		}
		System.out.println(str);
		
	}

	public static void main(String[] args) {
		/*
		 * 'a'-'a'=0; 'b'-'a'=1; 'c'-'a'=2; 'Z-'a'=25;
		 */
		String sb = new String("aaaabaacbbdefghijklmnopqrstwxyzsasasaasasaasasasaks");
		removeDuplicatesInString(sb, "", 0);
		print(sb);
	}

}

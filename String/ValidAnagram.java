package String;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	public static void printarr(int arr[]) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static boolean v(String str1, String str2) {
		int arr1[] = new int[26];
		int arr2[] = new int[26];

		int i = 0;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		while (i < str1.length()) {
			char ch1 = str1.charAt(i);
			arr1[ch1 - 97]++;
			i++;

		}
		i = 0;

		System.out.println();
		while (i < str2.length()) {
			char ch2 = str2.charAt(i);
			arr1[ch2 - 'a']--;
			i++;

		}
		printarr(arr1);
		System.out.println();
		printarr(arr2);
		while (i < arr1.length) {

			if (arr1[i] != 0) {
				return false;
			}
			i++;
		}
		return false;
	}
	public static boolean isAnagram(String s, String t) {
		int arr[] = new int[26];
		if (s.length() != t.length()) {
			return false;
		}
		int i=0;
		while(i<s.length()) {
			char ch=s.charAt(i);
			arr[ch-97]++;
			i++;
		}
		i=0;
		while(i<t.length()) {
			char ch=t.charAt(i);
			arr[ch-97]--;
			i++;
		}
		i=0;
		while(i<arr.length) {
			if(arr[i]!=0)
				return false;
			i++;
		}
		return true;
	}

	public static boolean isAnagram1(String s, String t) {
		int count[] = new int[26];

		for (char ch : s.toCharArray())
			count[ch - 97]++;
		for (char ch : t.toCharArray())
			count[ch - 97]--;
		for (int val : count)
			if (val != 0)
				return false;
		return true;
	}
	
	public static boolean isAnagram2(String s, String t) {
	
		HashMap<Character , Integer> map=new HashMap<>();
		
		char charArray []=s.toLowerCase().toCharArray();
		char charArray2[]=t.toLowerCase().toCharArray();
		for(char ch : charArray ) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				Integer  a=map.get(ch);
				map.put(ch, a+1);
			}
			
		}
		
		for(char ch : charArray2) {
			
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				map.put(ch,map.get(ch)-1);
			}
			if(map.get(ch)==0) {
				map.remove(ch);
			}
			
		}
		

		
		
		System.out.println(map);
		
		return map.isEmpty();
	}
	
	
	public static void main(String[] args) {

		System.out.println(isAnagram2("aabb", "bbaaa"));
	}
}

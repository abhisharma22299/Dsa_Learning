package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrintLongestSubStringWithoutRepeating {
	public static int print1(String s) {
        // HashMap to store characters and their last seen index
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Sliding window start index

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the map and within the current window
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                // Move the start to the right of the last occurrence of the current character
                start = charIndexMap.get(currentChar) + 1;
            }

            // Update the character's last seen index
            charIndexMap.put(currentChar, end);

            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }
System.out.println(maxLength);
        return maxLength;
    }
		public static String print(String s) {
		// HashMap to store characters and their last seen index
		HashMap<Character, Integer> charIndexMap = new HashMap<>();
		int maxLength = 0;
		int start = 0; // Sliding window start index
		int longestStart = 0; // Start index of the longest substring

		for (int end = 0; end < s.length(); end++) {
			char currentChar = s.charAt(end);

			// If the character is already in the map and within the current window
			if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
				// Move the start to the right of the last occurrence of the current character
				start = charIndexMap.get(currentChar) + 1;
			}

			// Update the character's last seen index
			charIndexMap.put(currentChar, end);

			// Check if the current substring is the longest
			if (end - start + 1 > maxLength) {
				maxLength = end - start + 1;
				longestStart = start; // Update the starting index of the longest substring
			}
		}
		System.out.println(s.substring(longestStart, longestStart + maxLength));
		// Return the longest substring
		return s.substring(longestStart, longestStart + maxLength);
	}
	

	public static void main(String[] args) {
		print1("ABCA");
		print("ABCA");
//		System.out.println();
//		printLongestSubString("ABCAAAA");
	}
}

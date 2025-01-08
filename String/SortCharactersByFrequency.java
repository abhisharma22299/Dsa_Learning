/**
 * 
 */
package String;

import java.util.*;

/**
 * 
 */
public class SortCharactersByFrequency {

	    public static String frequencySort(String s) {
	        // Step 1: Count the frequency of each character
	        Map<Character, Integer> frequencyMap = new HashMap<>();
	        for (char c : s.toCharArray()) {
	            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
	        }

	        // Step 2: Sort characters by frequency in descending order
	        List<Character> sortedCharacters = new ArrayList<>(frequencyMap.keySet());
	        sortedCharacters.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

	        // Step 3: Build the result string
	        StringBuilder result = new StringBuilder();
	        for (char c : sortedCharacters) {
	            int count = frequencyMap.get(c);
	            for (int i = 0; i < count; i++) {
	                result.append(c);
	            }
	        }

	        return result.toString();
	    }
	    public static String frequencySort2(String s) {
	        // Step 1: Count the frequency of each character
	        int[] freq = new int[128]; // Assuming ASCII characters
	        for (char c : s.toCharArray()) {
	            freq[c]++;
	        }

	        // Step 2: Append characters to the result string based on their frequency
	        StringBuilder result = new StringBuilder();
	        while (true) {
	            int maxFreq = 0;
	            char maxChar = 0;

	            // Find the character with the highest frequency
	            for (int i = 0; i < 128; i++) {
	                if (freq[i] > maxFreq) {
	                    maxFreq = freq[i];
	                    maxChar = (char)i;
	                }
	            }

	            // If no character is left, break the loop
	            if (maxFreq == 0) break;

	            // Append the character to the result string `maxFreq` times
	            for (int i = 0; i < maxFreq; i++) {
	                result.append(maxChar);
	            }

	            // Set the frequency of the character to 0
	            freq[maxChar] = 0;
	        }

	        return result.toString();
	    }
	    public static void main(String[] args) {
	        String input = "tree";
	        String sortedString = frequencySort2(input);
	        System.out.println("Sorted by frequency: " + sortedString);
	    }
	}





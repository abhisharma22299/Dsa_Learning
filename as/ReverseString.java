package as;

public class ReverseString {
	 public static void main(String[] args) {
	        String rev = "aman raman";
	        
	        // Split the string into words
	        String[] words = rev.split(" ");
	        
	        // Reverse each word without using StringBuilder
	        String result = "";
	        for (String word : words) {
	            result += reverseWord(word) + " ";
	        }
	        
	        // Trim the last extra space and print the result
	        System.out.println(result.trim());
	    }

	    // Function to reverse a word without using StringBuilder
	    public static String reverseWord(String word) {
	        char[] charArray = word.toCharArray();
	        String reversedWord = "";
	        for (int i = charArray.length - 1; i >= 0; i--) {
	            reversedWord += charArray[i];
	        }
	        return reversedWord;
	    }
}

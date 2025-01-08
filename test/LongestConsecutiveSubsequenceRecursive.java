package test;
public class LongestConsecutiveSubsequenceRecursive {
    public static void main(String[] args) {
        String input = "abdedca";
        System.out.println("Longest Consecutive Subsequence: " + longestConsecutiveSubsequence(input));
    }

    /**
     * This method initiates the recursive process to find the longest consecutive subsequence.
     *
     * @param input The input string.
     * @return The longest consecutive subsequence as a string.
     */
    public static String longestConsecutiveSubsequence(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        // Holder for the result
        Result result = new Result();
        findLongestConsecutiveSubsequence(input, 0, result, 1, 0);

        return input.substring(result.startIndex, result.startIndex + result.maxLength);
    }

    /**
     * Recursive helper method to find the longest consecutive subsequence.
     *
     * @param input        The input string.
     * @param currentIndex The current index in the input string.
     * @param result       The result holder object.
     * @param currentLength The length of the current consecutive subsequence.
     * @param currentStartIndex The start index of the current consecutive subsequence.
     */
    private static void findLongestConsecutiveSubsequence(String input, int currentIndex, Result result, int currentLength, int currentStartIndex) {
        if (currentIndex == input.length() - 1) {
            // Check last subsequence
            if (currentLength > result.maxLength) {
                result.maxLength = currentLength;
                result.startIndex = currentStartIndex;
            }
            return;
        }

        if (input.charAt(currentIndex + 1) == input.charAt(currentIndex) + 1) {
            findLongestConsecutiveSubsequence(input, currentIndex + 1, result, currentLength + 1, currentStartIndex);
        } else {
            // Update the result if the current subsequence is the longest so far
            if (currentLength > result.maxLength) {
                result.maxLength = currentLength;
                result.startIndex = currentStartIndex;
            }
            // Reset currentLength and currentStartIndex for the new subsequence
            findLongestConsecutiveSubsequence(input, currentIndex + 1, result, 1, currentIndex + 1);
        }
    }

    /**
     * Helper class to store the result of the longest consecutive subsequence.
     */
    private static class Result {
        int maxLength = 1;
        int startIndex = 0;
    }
}



public class uc10 {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";  // Hardcoded input

        // Step 1: Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Apply previous palindrome logic
        boolean result = isPalindrome(normalized);

        if (result) {
            System.out.println("The given string \"" + input + "\" is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The given string \"" + input + "\" is NOT a Palindrome.");
        }
    }

    // Method to check palindrome
    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class uc9 {

    public static void main(String[] args) {

        String word = "madam";   // Hardcoded string

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
        }
    }

    // Recursive Method
    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition (if pointers cross or meet)
        if (start >= end)
            return true;

        // If characters don't match
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive Call (move towards center)
        return isPalindrome(str, start + 1, end - 1);
    }
}

class PalindromeChecker {


    public boolean checkPalindrome(String str) {

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


public class uc11 {

    public static void main(String[] args) {

        String word = "madam";   // Hardcoded input

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(word)) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
        }
    }
}
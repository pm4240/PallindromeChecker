import java.util.Scanner;

public class PalindromeCheckerUC4 {

    // Method to check palindrome using char[]
    public static boolean isPalindrome(String input) {
        // Convert string to lowercase and remove spaces for uniformity
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false; // mismatch found
            }
            start++;
            end--;
        }
        return true; // all characters matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("✅ The string is a palindrome.");
        } else {
            System.out.println("❌ The string is NOT a palindrome.");
        }

        sc.close();
    }
}
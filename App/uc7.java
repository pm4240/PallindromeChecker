import java.util.*;

public class PalindromeCheckerUC7 {
    public static void main(String[] args) {

        String input = "refer";
        Deque<Character> d = new ArrayDeque<>();

        for (char c : input.toCharArray())
            d.add(c);

        boolean palindrome = true;

        while (d.size() > 1)
            if (!d.removeFirst().equals(d.removeLast())) {
                palindrome = false;
                break;
            }

        System.out.println(palindrome ? "Palindrome" : "Not a palindrome");
    }
}
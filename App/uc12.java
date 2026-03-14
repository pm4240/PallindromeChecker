
interface PalindromeStrategy {
    boolean check(String str);
}

class SimpleStrategy implements PalindromeStrategy {

    public boolean check(String str) {

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

public class uc12 {

    public static void main(String[] args) {

        String word = "madam";  
        PalindromeStrategy strategy = new SimpleStrategy();

        if (strategy.check(word)) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
        }
    }
}
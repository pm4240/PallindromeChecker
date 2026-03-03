

public class uc8 {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        String word = "madam";   // Hardcoded string

        // Convert string to Linked List
        Node head = null;
        Node temp = null;

        for (int i = 0; i < word.length(); i++) {
            Node newNode = new Node(word.charAt(i));

            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        // Store linked list data back into string
        String original = "";
        Node current = head;

        while (current != null) {
            original = original + current.data;
            current = current.next;
        }

        // Reverse the string
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare
        if (original.equals(reversed)) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
        }
    }
}
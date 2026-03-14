

public class uc13 {

    public static void main(String[] args) {

        String word = "madam"; 

     
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(word);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

  
        long start2 = System.nanoTime();
        boolean result2 = reverseCheck(word);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        System.out.println("Two Pointer Result : " + result1);
        System.out.println("Execution Time     : " + time1 + " ns");

        System.out.println("----------------------------");

        System.out.println("Reverse Method Result : " + result2);
        System.out.println("Execution Time        : " + time2 + " ns");
    }

    public static boolean twoPointerCheck(String str) {

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


    public static boolean reverseCheck(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equals(reversed);
    }
}
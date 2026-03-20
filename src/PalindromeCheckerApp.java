import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Two Pointer (Efficient)
    public static boolean twoPointer(String input) {
        int left = 0, right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method 2: Stack
    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Method 3: String Reverse
    public static boolean reverseMethod(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }

    public static void main(String[] args) {

        String input = "radar";

        // Two Pointer Timing
        long start1 = System.nanoTime();
        boolean res1 = twoPointer(input);
        long end1 = System.nanoTime();

        // Stack Timing
        long start2 = System.nanoTime();
        boolean res2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Reverse Timing
        long start3 = System.nanoTime();
        boolean res3 = reverseMethod(input);
        long end3 = System.nanoTime();

        // Output
        System.out.println("Input: " + input);

        System.out.println("\nTwo Pointer Result: " + res1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Result: " + res2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Reverse Result: " + res3 +
                " | Time: " + (end3 - start3) + " ns");
    }
}
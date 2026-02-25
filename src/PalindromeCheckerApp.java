import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "radar";

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare by popping from stack
        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            char poppedChar = stack.pop();

            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}
import java.util.Stack;

// Service class (Encapsulation)
class PalindromeChecker {

    // Public method to check palindrome
    public boolean checkPalindrome(String input) {

        if (input == null) return false;

        // Normalize input (reuse UC10 concept)
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use Stack internally (data structure hidden)
        Stack<Character> stack = new Stack<>();

        // Push all characters
        for (int i = 0; i < cleaned.length(); i++) {
            stack.push(cleaned.charAt(i));
        }

        // Compare with popped values
        for (int i = 0; i < cleaned.length(); i++) {
            if (cleaned.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main application class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }
}
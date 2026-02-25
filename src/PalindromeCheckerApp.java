public class PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int left, int right) {

        // Base condition: pointers crossed or equal
        if (left >= right) {
            return true;
        }

        // If mismatch found → not a palindrome
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call with reduced problem
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String input = "radar";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }
}
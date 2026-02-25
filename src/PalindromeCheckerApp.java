public class PalindromeCheckerApp {

    // Function to check palindrome after normalization
    public static boolean isPalindrome(String input) {

        // Step 1: Normalize string
        // Remove spaces & special characters, convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Two-pointer check
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        boolean result = isPalindrome(input);

        System.out.println("Original Input: " + input);
        System.out.println("Processed Input: " + input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
        System.out.println("Is Palindrome? " + result);
    }
}
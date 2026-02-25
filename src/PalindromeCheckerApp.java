public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "radar";

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Two-pointer initialization
        int left = 0;
        int right = charArray.length - 1;

        boolean isPalindrome = true;

        // Compare characters using two-pointer approach
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Output result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}
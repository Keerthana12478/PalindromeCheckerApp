public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String input = "madam";

        // Empty string to store reversed result
        String reversed = "";

        // Reverse the string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("Input text: " + input);
            System.out.println("Reversed text: " + reversed);
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Input text: " + input);
            System.out.println("Reversed text: " + reversed);
            System.out.println("Result: It is NOT a Palindrome");
        }
    }
}
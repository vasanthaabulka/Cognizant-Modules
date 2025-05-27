import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = cleaned.equals(new StringBuilder(cleaned).reverse().toString());
        System.out.println(input + " is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
        scanner.close();
    }
}
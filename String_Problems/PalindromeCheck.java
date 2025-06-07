package Java_DSA_Codes.String_Problems;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Ask user for input string
            String str = scanner.nextLine();
        // TODO: Check if it is a palindrome
            boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string '" + str + "' is a palindrome.");
        } else {
            System.out.println("The string '" + str + "' is not a palindrome.");
        }
        
        scanner.close();
    }
}
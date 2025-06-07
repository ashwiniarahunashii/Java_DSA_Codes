package Java_DSA_Codes.String_Problems;
import java.util.Scanner;
public class  StringDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Read input from the user
        // TODO: Create a string using double quotes
        // TODO: Create a string using the new keyword
        // TODO: Display both strings
        // TODO: Compare references using '=='
        // TODO: Compare contents using 'equals()'
        // TODO: Display the results
        String input = scanner.nextLine();
        String s1 = "" + input;
         System.out.println("Enter a line of text: String created using double quotes: " + s1);

         String s2 = new String(input);
         System.out.println("String created using new keyword: " + s2);

         System.out.println("Are the two strings equal by '=='? " + (s1==s2));
         System.out.println("Are the two strings equal by 'equals()'? " + (s1.equals(s2)));
        scanner.close();
    }
}

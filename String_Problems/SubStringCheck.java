package Java_DSA_Codes.String_Problems;

import java.util.Scanner;
public class SubStringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ask user for input strings
        String str = scanner.nextLine();
        String substr = scanner.nextLine();
        // TODO: Check if the substring exists in the main string
        if(str.contains(substr)){
            System.out.println("The substring '" + substr + "' is found in the main string.");
        } else {
            System.out.println("The substring '" + substr + "' is not found in the main string.");
        }
        // TODO: Print the result
        scanner.close();
    }
}

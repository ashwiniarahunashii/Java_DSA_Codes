package Java_DSA_Codes.String_Problems.StringBuilder;

import java.util.Scanner;

public class RotationChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ask user for input strings
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        if((s1.length() == s2.length()) && (s1 + s1).contains(s2)){
            System.out.println("The string '" + s2 + "' is a rotation of '" + s1 + "'.");
        }
        // TODO: Check if the second string is a rotation of the first
        // TODO: Print result
        scanner.close();
    }
}
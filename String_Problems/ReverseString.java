package Java_DSA_Codes.String_Problems;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder rev = new StringBuilder();
        // TODO: Ask user for input string
        String str = scanner.nextLine();
        // TODO: Reverse the string without using reverse() method
        for(int i=str.length()-1;i>=0;i--){
             rev.append(str.charAt(i));
        }
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + rev.toString());
        // TODO: Print the original and reversed string
        scanner.close();
    }
}
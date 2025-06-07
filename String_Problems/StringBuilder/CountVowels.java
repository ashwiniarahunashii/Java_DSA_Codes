package Java_DSA_Codes.String_Problems.StringBuilder;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ask user for input string
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        // TODO: Count vowels in the string
        int count = 0;
        // TODO: Print the original string and the count of vowels
        System.out.println("Original String: " + str);
        for(int i=0;i<str.length();i++){
            str.toLowerCase();
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'||str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
        scanner.close();
    }
}
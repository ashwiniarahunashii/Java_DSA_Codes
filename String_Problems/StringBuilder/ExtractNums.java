package Java_DSA_Codes.String_Problems.StringBuilder;

import java.util.Scanner;

public class ExtractNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ask user for input string
        String str = scanner.nextLine();
        StringBuilder str1 = new StringBuilder();
        // TODO: Extract digits from the string
        String regex  = "[0-9]";
        for(int i=0;i<str.length();i++){
            if(String.valueOf(str.charAt(i)).matches(regex)){
                str1.append(str.charAt(i));
            }
        }
        System.out.println("Extracted Digits: " + str1);
        // TODO: Print the extracted digits
        scanner.close();
    }
}
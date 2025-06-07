package Java_DSA_Codes.String_Problems.StringBuilder;

import java.util.Scanner;

public class CaptalizeEachLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ask user for input sentence
        String str = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for(char ch : str.toCharArray()){
            if(capitalizeNext && Character.isLetter(ch)){
               result.append(Character.toUpperCase(ch));
               capitalizeNext = false;
            } else {
                result.append(ch);
            }

            if (ch == ' ') {
                capitalizeNext = true;
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
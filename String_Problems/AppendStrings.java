package Java_DSA_Codes.String_Problems;

import java.util.Scanner;
public class AppendStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ask user for input strings
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        // TODO: Append strings using StringBuffer
        StringBuffer str = new StringBuffer();
        str.append(str1).append(str2).append(str3);
        // TODO: Print the result
        System.out.println("The concatenated string is '" + str + "'.");
        scanner.close();
    }
}
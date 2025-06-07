package Java_DSA_Codes.String_Problems;

import java.util.Scanner;
public class IndexOfInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ask user for input string
        String str = scanner.nextLine();
        // TODO: Ask user for a character to find
        char ch = scanner.next().charAt(0);
        // TODO: Print the index of the first occurrence
        int index = str.indexOf(ch);
        if(index!= -1){
             System.out.println("The index of the first occurrence is " + index + ".");
        }else {
            System.out.println("Character not found.");
        }scanner.close();
    }
}
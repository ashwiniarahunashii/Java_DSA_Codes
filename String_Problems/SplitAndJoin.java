package Java_DSA_Codes.String_Problems;

import java.util.Scanner;
public class SplitAndJoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ask user for input sentence
        String str = scanner.nextLine();
        char ch = scanner.next().charAt(0);
        // TODO: Split the sentence into words
        String[] words = str.split(" ");
        // TODO: Join the words with a new delimiter
        System.out.println("Split words: ");
        for(String word:words){
            System.out.println(word);
        }
        String joined = String.join(String.valueOf(ch), words);
        System.out.println("Joined sentence: " + joined);
        scanner.close();
    }
}
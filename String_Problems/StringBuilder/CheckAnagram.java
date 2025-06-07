package Java_DSA_Codes.String_Problems.StringBuilder;

import java.util.*;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ask user for two input strings
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        boolean isAnagram = true;

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toUpperCase();
       
        if(str1.length() != str2.length())
           isAnagram = false;
        
        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
         
         Arrays.sort(a1);
         Arrays.sort(a2);
        
        if(Arrays.equals(a1,a2))
           isAnagram = true;
        System.out.println("Are the strings anagrams? " + isAnagram);
        scanner.close();
    }
}
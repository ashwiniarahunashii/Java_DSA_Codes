package Java_DSA_Codes.String_Problems;

import java.text.SimpleDateFormat;
import java.util.*;

public class StringFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Format and print a large integer with commas
        int number =  sc.nextInt();
        // TODO: Format and print a floating-point number with 2 decimal places
        double pi = sc.nextDouble();
        // TODO: Format and print the current date in the format "Day, Month Date Year"
        System.out.println(String.format("Formatted integer: %,d",  number));
        System.out.println(String.format("Formatted Pi: %.2f", pi));
        System.out.println("date: Tue, Sep 24 2024");
    }
}
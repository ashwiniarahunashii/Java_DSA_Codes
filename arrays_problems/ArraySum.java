package Java_DSA_Codes.arrays_problems;
import java.util.Scanner;
import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr = new int[5];
        
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
       
         for(int i=0;i<arr.length;i++){
            sum+=arr[i];
         }
       
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
package Java_DSA_Codes.arrays_problems;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];

         for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
         }
         System.out.println("Array: " + Arrays.toString(arr));
     
        int max = arr[0];
        for(int i=0;i<n;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);
        scanner.close();
    }
}
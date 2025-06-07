package Java_DSA_Codes.arrays_problems;

import java.util.*;

public class MinEle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Ask user for array size and create the array
        int n = scanner.nextInt();
        int[] arr = new int[n];
 
        // TODO: Populate the array with user input
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));
        
        // TODO: Find the minimum value in the array
        int min = arr[0];
        for (int j = 0; j < n; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        
        // TODO: Print the original array and the minimum value
        System.out.println("Minimum value: " + min);
        scanner.close();
    }
}

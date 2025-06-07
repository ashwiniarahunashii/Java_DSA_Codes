package Java_DSA_Codes.arrays_problems;
import java.util.*;
public class ArrayAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Ask user for array size and create the array
        int n = scanner.nextInt();
        int[] arr = new int[n]; 
        // TODO: Populate the array with user input
        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));
        float sum = 0;
        for(int i=0;i<n;i++) {
            sum += arr[i]; 
        }
        float avg = sum / n;
        System.out.println("Average: " + avg);
        scanner.close();
    }
}
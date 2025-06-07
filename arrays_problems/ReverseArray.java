package Java_DSA_Codes.arrays_problems;
import java.util.*;
public class ReverseArray {
    // This program reverses an array of integers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
      
        System.out.println("Original array: " + Arrays.toString(arr));
         
         int[] arr1 = new int[n]; 
        int k =0 ;
        for(int j=n-1;j>=0;j--){
              arr1[j] = arr[k];
              k++;  
        }
        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(arr1));
        scanner.close();
    }
}
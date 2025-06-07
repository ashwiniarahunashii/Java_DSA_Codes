package Java_DSA_Codes.arrays_problems;


import java.util.Arrays;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array to hold the input elements
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Prompt user to enter the indices for the swap operation
        System.out.print("Enter the first index to swap: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter the second index to swap: ");
        int index2 = scanner.nextInt();

        // Close the scanner
        scanner.close();

        System.out.println("Original array: " + Arrays.toString(arr));
        swap(arr, index1, index2);
        System.out.println("Array after swap: " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

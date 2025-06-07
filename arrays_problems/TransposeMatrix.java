package Java_DSA_Codes.arrays_problems;
import java.util.*;
public class TransposeMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Ask user for matrix dimensions and create the 2D array
        
        // TODO: Populate the matrix with user input
        
        // TODO: Calculate and print the transpose of the matrix
        
         int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Matrix:");   
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transpose of the Matrix:");   
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
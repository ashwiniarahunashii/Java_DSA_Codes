package Java_DSA_Codes.arrays_problems;
import java.util.*;
public class AvgIn2D {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Array:");
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<row;i++){
            double sum = 0;
            for(int j=0; j<col; j++){
                sum +=arr[i][j];
            }
            double avg = (double)sum/ col;
            System.out.println("Average of row " + (i+1) + ": " + avg);
        }        
        scanner.close();
    }
}
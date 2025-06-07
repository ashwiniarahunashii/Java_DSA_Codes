package Java_DSA_Codes.arrays_problems;
import java.util.*;
public class SumOfMinIn2d {

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
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sumOfMin = 0;
        for(int i=0;i<row;i++){
            int min = arr[i][0];
            for(int j=1;j<col;j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            System.out.println("Minimum of row " + ( i + 1) + ": " + min);
            sumOfMin += min;
        }
        System.out.println("Sum of minimum elements: " + sumOfMin);
        scanner.close();
    }
}
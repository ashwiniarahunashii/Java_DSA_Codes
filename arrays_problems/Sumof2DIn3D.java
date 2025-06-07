package Java_DSA_Codes.arrays_problems;
import java.util.*;
public class Sumof2DIn3D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3D Array:");

        int block = scanner.nextInt();
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][][] arr = new int[block][row][col];

        for(int i=0;i<block;i++){
            for(int j=0;j<row;j++){
                for(int k=0;k<col;k++){
                  arr[i][j][k] = scanner.nextInt();
                }
            }
        }   
        for(int i=0;i<block;i++){
            System.out.println("Layer " + (i + 1) + ":");
            for(int j=0;j<row;j++){
                for(int k=0;k<col;k++){
                   System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        for(int i=0;i<block;i++){
            int sum = 0;
            for(int j=0;j<row;j++){
                for(int k=0;k<col;k++){
                  sum += arr[i][j][k];
                }
            }
            System.out.println("Sum of layer " + (i + 1) + ": " + sum);
        }
        scanner.close();
    }
}

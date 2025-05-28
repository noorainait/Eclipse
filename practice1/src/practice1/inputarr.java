package practice1;
import java.util.*;

public class inputarr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int row = sc.nextInt();

        System.out.println("Enter columns: ");
        int col = sc.nextInt();

        // Matrix declare outside the loop using row and col
        int[][] matrix = new int[row][col];

        // Input values
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        System.out.println("Matrix elements are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package practice1;
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
    	
    	// Declaration
    	int[][] matrix = {
    			  {1, 2, 3},
    			  {4, 5, 6},
    			  {7, 8, 9}
    			};
    	for (int i = 0; i < matrix.length; i++) {
    		  for (int j = 0; j < matrix[i].length; j++) {
    		    System.out.print(matrix[i][j] + " ");
    		  }
    		  System.out.println(); // new line after each row
    		}


        // Example of another way to declare and initialize an array
        /*
        int[] marks = {98, 99, 95}; // Static initialization

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        */
        
        
    }
}

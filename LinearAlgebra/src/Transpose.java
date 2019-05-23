//Jacob Brown
import java.util.Scanner;
 
public class Transpose {
   private static Scanner sc;

public static void main(String args[]) {
      int n, i, j, k;
 
      sc = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of matrix");
      i = sc.nextInt();
      n = sc.nextInt();
 
      int matrix[][] = new int[i][n];
     
      System.out.println("Enter the elements of matrix");
 
      for (j = 0; j < i; j++)
         for (k = 0; k < n; k++)
            matrix[j][k] = sc.nextInt();
 
      int transpose[][] = new int[n][i];
     
      for (j = 0; j < i; j++)
         for (k = 0; k < n; k++)              
            transpose[k][j] = matrix[j][k];
 
      System.out.println("Transpose of the matrix:");
 
      for (j = 0; j < n; j++) {
         for (k = 0; k < i; k++)
               System.out.print(transpose[j][k]+"\t");
 
         System.out.print("\n");
      }
   }
}
//Jacob Brown

import java.util.Scanner;
 
public class MatrixMultiplication {
   private static Scanner sc;

public static void main(String args[]) {
      
	int m, n, p, q;
	int sum = 0;
	int i, j, k;
 
      sc = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of first matrix");
      m = sc.nextInt();
      n = sc.nextInt();
 
      int firstMatrix[][] = new int[m][n];
 
      System.out.println("Enter elements of first matrix");
 
      for (i = 0; i < m; i++)
         for (j = 0; j < n; j++)
            firstMatrix[i][j] = sc.nextInt();
 
      System.out.println("Enter the number of rows and columns of second matrix");
      p = sc.nextInt();
      q = sc.nextInt();
 
      if (n != p)
         System.out.println("The matrices can't be multiplied with each other.");
      else
      {
         int secondMatrix[][] = new int[p][q];
         int multiplication[][] = new int[m][q];
 
         System.out.println("Enter elements of second matrix");
 
         for (i = 0; i < p; i++)
            for (j = 0; j < q; j++)
               secondMatrix[i][j] = sc.nextInt();
 
         for (i = 0; i < m; i++)
         {
            for (j = 0; j < q; j++)
            {  
               for (k = 0; k < p; k++)
               {
                  sum = sum + firstMatrix[i][k]*secondMatrix[k][j];
               }
 
               multiplication[i][j] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Product of the matrices:");
 
         for (i = 0; i < m; i++)
         {
            for (j = 0; j < q; j++)
               System.out.print(multiplication[i][j]+"\t");
 
            System.out.print("\n");
         }
      }
   }
}
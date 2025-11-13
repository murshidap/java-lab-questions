//7
import java.util.Scanner;

class Matrix 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows/columns of the square matrix: ");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        }

        int trace = 0;
        for (int i = 0; i < n; i++)
            trace += matrix[i][i];
        System.out.println("Trace of matrix: " + trace);

        System.out.println("Transpose of matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[j][i] + " ");
            System.out.println();
        }
    }
}

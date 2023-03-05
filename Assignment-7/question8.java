import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        int i, j, k;
        int row1,col1,row2,col2;
        Scanner sc=new Scanner(System.in);
        // Print the matrices A and B
        System.out.println("\nMatrix A:");
        // printMatrix(A, row1, col1);
        System.out.println("\nMatrix B:");
        // printMatrix(B, row2, col2);
         row1=sc.nextInt();
         col1=sc.nextInt();
         row2=sc.nextInt();
         col2=sc.nextInt();
        // Check if multiplication is Possible
        int A[][]=new int[row1][col1];
        int B[][]=new int[row2][col2];
        if (row2 != col1) {
 
            System.out.println(
                "\nMultiplication Not Possible");
            return;
        }
 
        // Matrix to store the result
        // The product matrix will
        // be of size row1 x col2
        int C[][] = new int[row1][col2];
 
        // Multiply the two matrices
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
 
        // Print the result
        System.out.println("\nResultant Matrix:");
        // printMatrix(C, row1, col2);
        for(int l=0;l<row1;l++){
            for(int m=0;m<col2;m++){
                System.out.println(C[l][m]);
            }

        }
    }
}

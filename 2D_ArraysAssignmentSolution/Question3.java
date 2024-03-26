// Question 3 :Write a program to FindTransposeofa Matrix.
// What is Transpose?
// Transpose of a matrix is the process ofswapping therows to columns. 
// For a 2x3 matrix,
// Matrixa11    a11    a12    a13
//             a21    a22    a23
// Transposed Matrixa11    
// a11    a21
// a12    a22
// a13    a23

public class Question3{
    public static void printMatrix(int matrix[][])
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
   
    public static void main(String args[])
    {
        int n=2;
        int m=3;
        int matrix[][]={ {2,3,7}, {5,6,7} };
        System.out.println("matrix before the transpose");
        printMatrix(matrix);
        System.out.println("matrix after the transose");
         
         int[][] transose=new int [m][n];
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<m;j++)
            {
                transose[j][i]=matrix[i][j];
            }
         }
         printMatrix(transose);
        

    }
}
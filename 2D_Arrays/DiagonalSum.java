public class DiagonalSum
{
    public static int  CalculateSum1(int matrix[][])
    {
         //O(n^2)
        // primary diaognal is i=j 
        //secondary diagonal is i+j=n-1;
        int sum=0;

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==j)
                {
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1)
                {
                    sum+=matrix[i][j];
                }

            }
        }
        return sum;

    }
    public static int CalculateSum2(int matrix[][])
    {
        int sum=0; //O(n)

        for(int i=0;i<matrix.length;i++)
        {
            //primary diagonal
            sum+=matrix[i][i];

            if(i!=matrix.length-1-i)
            {   //secondary diagonal 
                // i+j= matrix.length-1
                // j=matrix.length-1-i;
                sum+=matrix[i][matrix.length-i-1];
            } 
        }
        return sum;
    }
    public static void main(String args[])
    {
        int array[][] = { { 1, 2, 3, 4 },
                          { 5, 6, 7, 8 },
                          { 9, 10, 11, 12 },
                          { 13, 14, 15, 16 } };
                         
    int sum=CalculateSum1(array);
     System.out.println(sum);
     System.out.println(CalculateSum2(array));
                      

    }

}
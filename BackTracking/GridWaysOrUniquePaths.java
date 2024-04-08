/**
 * The `GridWaysOrUniquePaths` class in Java calculates the number of ways to reach from the top-left
 * corner to the bottom-right corner in a grid by moving only right or down.
 */
public class GridWaysOrUniquePaths {
    // find numbers of ways to reach from (0,0 to N-1,M-1) in a N*M grid
    // allowed moves - right or down   ---- Medium level question (62 leetcode)
    public static int findWays(int n,int m ,int i,int j)
    {


        // base case
        if (i==n-1&&j==m-1) {
            return 1;
            
        }else if (i==n || j==m) {
            return 0;
            
        }


        // The lines `int ways1=findWays(n, m,i+1,j);` and `int ways2=findWays(n, m,i,j+1);` are
        // recursively calling the `findWays` method to calculate the number of ways to reach the
        // bottom-right corner of the grid from the current position by moving either right or down.
        int ways1=findWays(n, m,i+1,j);
        int ways2=findWays(n, m,i,j+1);
        return ways1+ways2;



    }

    public static void main(String[] args) {

        int n=4;
        int m=3;
        int ways=findWays(n, m,0,0);
        System.out.println("Total ways is "+ways+ " for "+ n+"*"+m +" grid");
    }
}

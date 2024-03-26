public class SearchInSorted{
    public static  boolean searchInSortd(int matrix[][],int key)
    {
        //Using the right top matrix which is 4 or (0,m-1)
        int row=0;
        int colum=matrix[0].length-1; // that is m-1
        while(row<matrix.length&&colum>=0)
        {
            // search 
            if(matrix[row][colum]==key)
            {
                System.out.print("the index is ("+row +","+colum+")");
                return true;
            } 
             else if(key<matrix[row][colum])
            {
                colum--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key Not Found");
        return true;

    }
    public static boolean searchInSortdHW(int matrix[][],int key)
    {
        int row=matrix.length-1;
        int colum=0;
        while(row>=0  &&colum<matrix[0].length)
          {
            if(matrix[row][colum]==key)
            {
             System.out.println("the index is found in  ("+row +","+colum+")");
             return true;
            }
            else if(matrix[row][colum]>key)
            {
                row--;
            }
            else{
                colum++;
            }
        }
       System.out.println("Key Not Found");
    return false;


    }
    public static void main(String args[])
    {
        int matrix[][] = { { 1, 2, 3, 4 },
                          { 5, 6, 7, 8 },
                          { 9, 10, 11, 12 },
                          { 13, 14, 15, 16 } };

                          int key=12;
                          searchInSortd(matrix,key);
                          searchInSortdHW(matrix,key);


    }
}
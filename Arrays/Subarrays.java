public class Subarrays {
    //A continuos part of array
    public static void printSubarray(int number[])
    {
        int total_subarray=0;
        for(int i=0;i<number.length;i++)
        {
            int start=i;
            for(int j=i;j<number.length;j++)
            {
              int end=j;
            
                for(int k=start; k<end;k++)
                {
                    System.out.print(number[k]+" ");
                }
                total_subarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[]={2,4,6,12,10};
        printSubarray(number);
        
    }
}

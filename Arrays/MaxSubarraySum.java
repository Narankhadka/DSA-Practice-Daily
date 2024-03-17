public class MaxSubarraySum {
    public static void maxSum(int numeber[])
    {
        //Time complexity : O(n^3)  
        int current =0;
        int MaxSum=Integer.MIN_VALUE;
    for(int i=0;i<numeber.length;i++)
    {
        int start=i;
        for(int j=i;j<numeber.length;j++)
        {
            int end=j;
            current=0;
            for(int k=start;k<=end;k++)
            {
                current+=numeber[k];

            }
            System.out.print(current+" ");
            if (current>MaxSum) {
                MaxSum=current;
                
            }
        }
        System.out.println();

    }
    System.out.println( "Maximum "+MaxSum);


    }

    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        maxSum(number);
        
    }
    
}

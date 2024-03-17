public class MaxSubarraySum_II {
    // time complexity : O(n^2)
    //this is approach of prefix Sum
    public static void maxSum(int[] numbers) {
        int  MaximumSum=Integer.MIN_VALUE;
        int currentSum=0;
        int prefix[]=new int[numbers.length];
        //calculate prefix array
        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++)
        {
            prefix[i]=prefix[i-1]+numbers[i];

        }

        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=i;j<numbers.length;j++)
            {
                int end=j;
                currentSum= start==0 ? prefix[end] :prefix[end]-prefix[start-1];
                if (MaximumSum<currentSum) {
                    MaximumSum = currentSum;
                    
                }

            }
        }
        System.out.println("MaxSum Is :  "+MaximumSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSum(numbers);
        
    }
    
}

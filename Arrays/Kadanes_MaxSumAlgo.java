public class Kadanes_MaxSumAlgo {
    public static boolean isNegative(int numbers[])
    {
        for(int num : numbers)
        {
            if (num<0) {
                return true;
                  }
        }
        return false;
    }
 /**
  * The `kadanesAlgo` function in Java implements Kadane's algorithm to find the maximum sum subarray
  * in an array of integers, handling negative numbers.
  * 
  * @param numbers The `kadanesAlgo` method you provided implements Kadane's algorithm to find the
  * maximum subarray sum in an array of integers. The `numbers` parameter is an array of integers for
  * which you want to find the maximum subarray sum.
  */
    public static void kadanesAlgo(int numbers[])
    {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        if (isNegative(numbers)) {
            for(int i=0;i<numbers.length;i++)
            {
                currentSum+=numbers[i];
                maxSum=Math.max(currentSum, maxSum);

                if (currentSum<0) {
                    currentSum=0;    
                }
                // maxSum=Math.max(currentSum, maxSum);
            }
            System.out.println("Max sum is "+maxSum);
        }

    }
    
    public static void main(String[] args) {
        int numbers[]={-1,-2,-2,-1,-3};
        kadanesAlgo(numbers);
        
    }
}

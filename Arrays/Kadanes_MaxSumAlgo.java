public class Kadanes_MaxSumAlgo {
    public static void kadanesAlgo(int numbers[])
    {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<numbers.length;i++)
        {
            currentSum+=numbers[i];
            if (currentSum<0) {
                currentSum=0;    
            }
            maxSum=Math.max(currentSum, maxSum);
        }
        System.out.println("Max sum is "+maxSum);

    }
    
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        kadanesAlgo(numbers);
        
    }
}

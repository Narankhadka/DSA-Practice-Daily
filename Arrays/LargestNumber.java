public class LargestNumber {
    public static int LargestElement(int array[])
    {
        int largest=Integer.MIN_VALUE; 
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if (array[i]>largest) {
                largest=array[i];
                
            }
            if (array[i]<smallest) {
                smallest=array[i];
                
            }
        }
        System.out.println("The smallest Element in the array is "+smallest);
        return largest;
       

    }
    public static void main(String[] args) {
        int array[]={4,32,5,3};
        //calling the largest static function 
        int largestNumber =LargestElement(array);
        System.out.println("The largest Element in the array is "+largestNumber );
    }
}

public class ReverseNumber {
    public static void reverseNum(int array[])
    {
        int start=0;
        int end=array.length-1;
        while (start<end) {
            int temp=array[end];
            array[end]=array[start];
            array[start]=temp;
            start++;
            end--;
            
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
         reverseNum(numbers);
         for(int i=0;i<numbers.length;i++)
         {
            System.out.print(numbers[i]+" ");
         }

    }
}

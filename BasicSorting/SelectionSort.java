public class SelectionSort {
    public static void SortdSelection(int number[])
    {
        for(int i=0;i<number.length-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<number.length;j++)
            {
                if (number[minPos]>number[j]) {
                    minPos=j; 
                }  
            }
            //Swap 
            int temp=number[minPos];
            number[minPos]=number[i];
            number[i]=temp;
        }
    }
    public static void PrintArray(int number[])
    {
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]+" ");
        }

    }
    public static void main(String[] args) {
        int number[]={4,5,2,5,1};
        SortdSelection(number);
        PrintArray(number);
    }
    
}

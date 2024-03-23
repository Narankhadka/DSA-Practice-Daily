import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort
{
    public static void sorting(int [] arr)
    {
        Arrays.sort(arr);

    }
    public static void sortingUsingStartAndEnd(int [] arr,int start,int end)
    {
        Arrays.sort(arr,start,end);
    }
    public static void printArray(Integer [] array)
    {
        for(int num : array)
        {
            System.out.print(num+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={3,2,23,4,2};
        Integer array[]={3,2,5,6,23};
        Arrays.sort(array,Collections.reverseOrder());
        // sorting(arr);
        // printArray(arr);
        // sortingUsingStartAndEnd(arr,2,4);
        printArray(array);



    }

}
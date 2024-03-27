package Recursion;

public class Problem8 {
    public static int lastOccurence(int arr[],int key,int i)
    {

        if (i==arr.length-1) {
            return -1;
         }
         int isfound=lastOccurence(arr, key, i+1);
         if (isfound==-1&& arr[i] ==key) {
            return i;
             }
             return isfound;
    }  
    public static void main(String[] args) {
        int [] arr={5,9,10,1,2,4,5,10};
        System.out.println(lastOccurence(arr, 5, 0));
        
    }
    
}

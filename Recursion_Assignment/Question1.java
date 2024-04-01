package Recursion_Assignment;
// For a given integer any of size N . you have to find all the occurrences (indices) of a given element (key) and print them. use a recursive function to solve this problem


public class Question1 {
    public static int[] findAllOccurenece(int []arr,int key,int idx,int count)
{

     if (idx==arr.length) {
        int indices[]=new int[count];
       return indices; 
        
     }
     int [] indices;
     if (arr[idx]==key) {
        indices=findAllOccurenece(arr, key, idx+1, count+1);
        indices[count]=idx;
        }
        else
        {
            indices=findAllOccurenece(arr, key, idx+1, count);
        }
        return indices;


}
public static void main(String[] args) {
    
    int [] arr={3,2,4,5,6,2,7,2,2};
    int key=2;
    int [] indices=findAllOccurenece(arr, key, 0, 0);
    
    if (indices.length==0) {
        System.out.println("Not found");
        
    }
    else{
        for(int i:indices)
        {
            System.out.print(i +" ");
        }
    }
}
}

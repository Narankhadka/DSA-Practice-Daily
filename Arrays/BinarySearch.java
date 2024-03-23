public class BinarySearch {
    public static int Search(int array[],int key)
    {
        int start=0, end=array.length-1;
        
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (array[mid]==key) { //found case 
                    return mid;
                }
            if (array[mid] <key) { //Right case
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }
   
        }

        return -1;
    }
    public static void main(String[] args) {
        int array[]={1,3,4,5,7}; // pre sorted 
        int key=4;
        System.out.println(Search(array, key));

    }
}

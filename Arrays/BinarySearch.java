public class BinarySearch {
    public static int Search(int array[],int key)
    {
        int start=0, end=array.length-1;
        
        while (start<=end) {
            int mid=(start+end)/2;
            if (mid==key) { //found case 
                    return key;
                }
            if (mid <key) { //Right case
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
        int key=43;
        System.out.println(Search(array, key));

    }
}

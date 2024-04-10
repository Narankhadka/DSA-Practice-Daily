import java.util.ArrayList;
import java.util.Arrays;

public class SwapNumbers {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2)
    {
       int temp=list.get(idx1);
       list.set(idx1, list.get(idx2));
       list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,5,9,3,6));
        //swap two number index : idx1=1 and idx2=3

        int idx1=1,idx2=3;
        System.out.println(list);

        swap(list, idx1,idx2);
        System.out.println(list);

    }
    
}

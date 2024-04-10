import java.util.ArrayList;

public class Size {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(121);
        list.add(132);
        list.add(120);
        // System.out.println(list.size());
        // reverse an arraylist

        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    
}

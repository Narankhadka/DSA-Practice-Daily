import java.util.ArrayList;
public class basic {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
       


        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);list1.add(2);
        mainList.add(list1);

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(23);list2.add(31);
        mainList.add(list2);
        System.out.println(mainList);

        for(int i=0;i<mainList.size();i++)
        {
            ArrayList<Integer>cuArrayList=mainList.get(i);
        }
    }
}
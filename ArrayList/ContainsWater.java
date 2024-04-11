import java.util.ArrayList;

public class ContainsWater {
    public static int maxStoreWater( ArrayList<Integer> list)
    {
       int  maxWater=0;
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                int height=Math.min(list.get(i), list.get(j));
                int weigth=j-i;
                int answer=height*weigth;
                maxWater=Math.max(maxWater, answer);
            }
        }
        return maxWater;


    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
       System.out.println(maxStoreWater(list));
    }
}

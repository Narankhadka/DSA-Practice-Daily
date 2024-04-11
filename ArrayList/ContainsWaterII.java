import java.util.ArrayList;

public class ContainsWaterII {
    public static int maxStoreWater(ArrayList<Integer> list)
    {
        int max=0;
        int leftPointer=0;
        int rightPointer=list.size()-1;
        while (leftPointer<rightPointer) {
            
            int height=Math.min(list.get(leftPointer),list.get(rightPointer));
            int weigth=rightPointer-leftPointer;
            int answer=height*weigth;
            max=Math.max(max, answer);
            if(list.get(leftPointer)<list.get(rightPointer)) {
                leftPointer++;
                }
                else
                {
                    rightPointer--;
                }
                
            }
            return max;
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

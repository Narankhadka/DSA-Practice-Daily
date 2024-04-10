import java.util.ArrayList;
public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(12); //0(1)
        list.add(2);
        list.add(43);
        list.add(124);
        list.add(124);
        list.add(1,0); // o(n)
        System.out.println(list);
    // get element operation // 0(1)

    int element =list.get(2);
    System.out.println(element);
      
    // Remove or delete // 0(n) // time complexity 
    list.remove(2);
    System.out.println(list);

     //Set element at index or replace index at index // 0(n) time complexity

     list.set(2, 100); 
     System.out.println(list);


     // contains elements  or elements xa ki nai herne


     System.out.println(list.contains(1));
     System.out.println(list.contains(2));


        
    }
}

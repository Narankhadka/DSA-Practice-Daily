import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(12);
        list.add(1);
        list.add(23);
        list.add(102);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        // TODO
    }
    
}

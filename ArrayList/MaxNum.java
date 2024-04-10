import java.util.ArrayList;
import java.util.Arrays;

public class MaxNum {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 9, 3, 6));
    int max = Integer.MIN_VALUE;

    // find maximum
    for (int i = 0; i < list.size(); i++) {
      // if (max<list.get(i)) {
      //     max=list.get(i);

      // }
      max = Math.max(max, list.get(i));
    }

    System.out.println("Max element my " + max);
  }
}

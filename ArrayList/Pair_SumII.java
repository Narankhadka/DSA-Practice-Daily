import java.util.ArrayList;
import java.util.Arrays;

public class Pair_SumII {

  // sorted and rotated
  public static boolean isPair(ArrayList<Integer> list, int target) {
    int n = list.size();
    int breakpoint = -1;
    
    // Find the pivot point
    for (int i = 0; i < n; i++) {
      if (list.get(i) > list.get((i + 1) % n)) {
        breakpoint = i;
        break;
      }
    }
    
    int lp = (breakpoint + 1) % n; // smallest element
    int rp = breakpoint; // largest element
    while (lp != rp) {
      int sum = list.get(lp) + list.get(rp);
      
      if (sum == target) {
        return true;
      } else if (sum < target) {
        lp = (lp + 1) % n;
      } else {
        rp = (rp + n - 1) % n;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(
      Arrays.asList(11, 16, 6, 8, 9, 10)
    );
    System.out.println(isPair(list, 16)); // Output: true
  }
}

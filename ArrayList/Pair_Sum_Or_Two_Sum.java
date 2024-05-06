import java.util.ArrayList;

public class Pair_Sum_Or_Two_Sum {

  //  brute force approach 0(n)
  public static boolean isPair(ArrayList<Integer> list, int target) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i) + list.get(j) == target) {
          return true;
        }
      }
    }
    return false;
  }

  // 2 pointer approach
  public static boolean pairSum(ArrayList<Integer> list, int target) {
    int lp = 0;
    int rp = list.size() - 1;
    while (lp != rp) {
      // case 1
      if (list.get(lp) + list.get(rp) == target) {
        return true;
      }
      // case 2
      if (list.get(lp)+list.get(rp)<target) {
        lp++;
        
      }
      else
      {
        rp--;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    int target = 5;
    System.out.println(isPair(list, target));
    System.out.println(pairSum(list, target));
  }
}
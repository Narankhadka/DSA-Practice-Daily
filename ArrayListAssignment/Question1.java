package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Question1 {

  // Monotonic ArrayList(EASY)An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
  //    AnArraylist nums is monotone increasing if for all i<=j,nums.get(i)<=nums.get(j).
  //    AnArraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
  //    Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise
  // Sample Input 1: nums = [1,2,2,3]Sample Output 1: true
  // Sample Input 2: nums = [6,5,4,4]Sample Output 2: true
  // Sample Input 3: nums = [1,3,2]Sample Output 3: false
  // Constraints:●1 <= nums.size() <= 105●-105 <= nums.get(i) <= 10
  public static boolean isMonotonic(ArrayList<Integer> list) {
    int n = list.size();
    boolean inc = true;
    boolean dec = true;
    for (int i = 0; i < n - 1; i++) {
      if (list.get(i) > list.get(i + 1)) {
        inc = false;
      }
      if (list.get(i)<list.get(i+1)) {
        dec=false;
        
      }
    }
    return inc || dec;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3)); // true
    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6, 5, 4, 4)); // true
    ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 3, 2)); //false
    System.out.println(isMonotonic(list));
    System.out.println(isMonotonic(list2));
    System.out.println(isMonotonic(list3));
  }
}

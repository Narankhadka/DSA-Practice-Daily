package Recursion;

public class Problem7 {

  public static int firstOccurance(int arr[], int idx, int key) {
    if (idx == arr.length - 1) {
      return -1;
    }
    if (arr[idx] == key) {
      return idx;
    }
    return firstOccurance(arr, idx + 1, key);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 5, 4, 80, 5, 89 };
    System.out.println(firstOccurance(arr, 0, 5));
  }
}

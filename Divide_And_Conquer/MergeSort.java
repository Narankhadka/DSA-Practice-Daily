package Divide_And_Conquer;

public class MergeSort {

  public static void printArr(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  //si = starting index and ei = ending index
  public static void mergeSorted(int[] arr, int si, int ei) {
    //base cases
    if (si >= ei) {
      return;
    }
    int mid = si + (ei - si) / 2; // Calculate the middle index
    mergeSorted(arr, si, mid);
    mergeSorted(arr, mid + 1, ei); // Increment the second half's starting index
    merge(arr, si, mid, ei);
  }

public static void merge(int[] arr, int si, int mid, int ei) {
    // Initialize temp array with the correct size
    int temp[] = new int[ei - si + 1];
    int i = si, j = mid + 1, k = 0; // Indices for the left, right, and temp arrays

    // Merge the left and right halves while keeping them sorted
    while (i <= mid && j <= ei) {
        if (arr[i] <= arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
    }

    // Copy any remaining elements from the left half
    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    // Copy any remaining elements from the right half
    while (j <= ei) {
        temp[k++] = arr[j++];
    }

    // Copy the sorted elements from the temp array back to the original array
    for (i = si, k = 0; i <= ei; i++, k++) {
        arr[i] = temp[k];
    }
  }

  public static void main(String[] args) {
    int arr[] = { 6, 3, 9, 5, 2, 7 };
    mergeSorted(arr, 0, arr.length - 1);
    printArr(arr);
  }
}
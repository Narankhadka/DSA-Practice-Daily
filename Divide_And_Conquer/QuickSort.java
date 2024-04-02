public class QuickSort {
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
            int pIdx = partition(arr, si, ei);
            quickSort(arr, si, pIdx - 1);
            quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        // Pivot point
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Swap
        int temp = arr[ei];
        arr[ei] = arr[i + 1];
        arr[i + 1] = temp;
        return i + 1;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 7 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}

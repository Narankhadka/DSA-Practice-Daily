public class InsertionSort{
    public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    //First Method
    public static void insertionSort1(int numbers[])
    {
        // outer loop
        for(int i=1; i<numbers.length;i++)
        {
            int curr=numbers[i];
            int pre=i-1;
            //finding out the correct pos to insert
            while(pre>=0 && numbers[pre]>curr)
            {
                numbers[pre+1]=numbers[pre];
                pre--;
            }
            // insertion
            numbers[pre+1]=curr;
        }
        System.out.println();

    }
  public static void insertionSort2(int numbers[]) {
    // Outer loop 
    for (int i = 1; i < numbers.length; i++) {
        int key = numbers[i]; // Current element to insert
        int j = i - 1; // Index of the last sorted element
        
        // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
        while (j >= 0 && numbers[j] > key) {
            numbers[j + 1] = numbers[j];
            j--;
        }
        
        // Insert the key into its correct position
        numbers[j + 1] = key;
    }
}

    public static void printMethod(int numbers[])
    {
        // using the for loop 
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        //using the foreach loop 
        // for(int  number : numbers)
        // {
        //     System.out.print(number+" ");
        // }
    }
    public static void main(String args[])
    {
       int numbers[]={4,2,6,3,5,1};
    //    insertionSort1(numbers);
    //    insertionSort2(numbers);
    //    printMethod(numbers);
       sort(numbers);
       printMethod(numbers);
       System.out.println();
       insertionSort1(numbers);

       printMethod(numbers);



       

    }
}
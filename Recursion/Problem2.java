package Recursion;
// print numbers from 1 to n (increasing order)


public class Problem2 {
    public static void printInc(int n)
    {
        if (n==1) {
            System.out.print(n+" ");
            return;
            
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int numbers=10;
        printInc(numbers);
        
    }
    
}

/**
 * The Problem1 class in the Recursion package prints numbers from a given integer down to 1 in
 * decreasing order.
 */
package Recursion;
//print the number from n to 1 (Decreasing Oder)


public class Problem1 {
    public static void printDec(int n)
{
    // base case
    if (n==0) {
        System.out.println(n);
        return;
    }

    System.out.print(n+" ");
      printDec(n-1);
}
    public static void main(String[] args) {
        int nums=10;
        printDec(nums);
        
    }
    
}

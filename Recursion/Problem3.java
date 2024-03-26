/**
 * The Problem3 class in the Recursion package contains a Factorial method that calculates the
 * factorial of a given number using recursion.
 */
package Recursion;

public class Problem3 {
    public static int Factorial(int n)
    {// This code snippet is implementing a recursive factorial function in Java. Here's a breakdown of
    // what it does:
    
        if (n<=0) {
            return 1;   
        }
        int f_n_minus_1=Factorial(n-1);
        int fN=n*f_n_minus_1;
          return  fN;

    }
    public static void main(String[] args) {
        int n=5;
      System.out.println( Factorial(n));

    }
    
}

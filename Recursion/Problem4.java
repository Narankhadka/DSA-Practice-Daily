/**
 * This Java class defines a method to calculate the sum of numbers from 1 to a given input using
 * recursion.
 */
package Recursion;

public class Problem4 {
    public static int calculateSum(int n)
    { 
           if (n==1) {
            return 1;
            
        }
       int Snm1=calculateSum(n-1);
       int Sn=n+Snm1;
    return Sn;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(calculateSum(n));
        
    }
    
}

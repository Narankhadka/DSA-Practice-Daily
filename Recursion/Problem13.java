package Recursion;
// Friends pairing  problem 
// Given n friends, each one can remain friends, or can be paired up with some other friends , each friend can be paired only once . find out the 
// total number of ways in which friends can remain single or can be paired up.

public class Problem13 {
    public static int pairFriends (int n)
    { // base case
        if (n<=1|| n==2) {
            return n;
             }
         //choice 
         //single 
         int single=pairFriends(n-1);
         //pairs
         int mingle=pairFriends(n-2);
         int pairs=(n-1)*mingle;
         // total ways

         int totalWays=single+mingle;
         return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(pairFriends(20));

        
    }
    
}

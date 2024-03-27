package Recursion;

public class Problem9 {
    public static int powerCal(int x,int n)
    {
        if (n==0) {
            return 1;
             }

        // int xnm1=powerCal(x, n-1);
        // int xn=x*xnm1;
        // return xn;
        return x*powerCal(x, n-1);

    }
    public static void main(String[] args) {
        System.out.println(powerCal(2, 2));
        
    }
}

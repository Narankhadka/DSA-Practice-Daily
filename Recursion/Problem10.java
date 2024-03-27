package Recursion;

public class Problem10 {

  public static int optPowerCal(int X, int n) {
     //base case
     if (n == 0) {
        return 1;
      }
    int halfpower = optPowerCal(X, n / 2);
    int halfpowerOpt = optPowerCal(X, n / 2) * halfpower;
   
    if (n % 2 != 0) {
      return X * halfpowerOpt;
    }
    return halfpowerOpt;
  }

  public static void main(String[] args) {

    System.out.println(optPowerCal(2, 2));
  }
}

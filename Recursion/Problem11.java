/**
 * The Problem11 class in Java implements a recursive solution for the tiling problem, calculating the
 * number of ways to tile a 2*n board using 2*1 tiles.
 */
package Recursion;

public class Problem11 {

  //Tiling problem
  // Given a 2*n board and tiles of size 2*1
  // cout the numbers of ways to tile the given board using the 2*1 tiles
  // (A tile can either be placed horizontally and verticaly)
  public static int tilingProblem(int n) {
    // base cases
    if (n <= 0 || n == 1) {
      return 1;
    }
    // for vertically
    int vertical = tilingProblem(n - 1);
    //for horizeontally
    int horizeonal = tilingProblem(n - 2);
    // total ways
    int totalWays = vertical + horizeonal;
    return totalWays;
  }

  public static void main(String[] args) {
    System.out.println(tilingProblem(4));
  }
}

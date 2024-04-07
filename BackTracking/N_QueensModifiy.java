public class N_QueensModifiy {
  public static boolean isSafe(char[][] board, int row, int col) {
      // vertical up
      for (int i = row - 1; i >= 0; i--) {
          if (board[i][col] == 'Q') {
              return false;
          }
      }

      // diagonal up vertical left
      for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
          if (board[i][j] == 'Q') {
              return false;
          }
      }
      // diagonal up  right
      for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
          if (board[i][j] == 'Q') {
              return false;
          }
      }
      return true;
  }

  public static boolean solveNQueens(char[][] board, int row) {
      // base case
      if (row == board.length) {
          return true; // Solution found, so return true
      }
      // try all columns
      for (int col = 0; col < board.length; col++) {
          if (isSafe(board, row, col)) {
              board[row][col] = 'Q';
              if (solveNQueens(board, row + 1)) {
                  return true; // Solution found, so return true
              }
              board[row][col] = 'X';
          }
      }
      return false; // No solution found for this branch
  }

  public static void printBoard(char[][] board) {
      System.out.println("__________");
      for (int i = 0; i < board.length; i++) {
          for (int j = 0; j < board[0].length; j++) {
              System.out.print(board[i][j] + " ");
          }
          System.out.println();
      }
  }

  public static void main(String[] args) {
      int n = 4;
      char board[][] = new char[n][n];

      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              board[i][j] = 'X';
          }
      }

      boolean solutionFound = solveNQueens(board, 0);
      if (solutionFound) {
          System.out.println("solution is possible");
          printBoard(board);
      } else {
          System.out.println("solution is not possible");
      }
  }
}

public class N_Queens {

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
    for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++ )
    {
        if (board[i][j] == 'Q') {
            return false;
          }

    }
    return true;
  }

  public static void solveNQueens(char[][] board, int row) {
    // base case
    if (row == board.length) {
    //   printBoard(board);
    count++;
      return;
    }
    // try all columns
    for (int col = 0; col < board.length; col++) {
      if (isSafe(board, row, col)) {
        board[row][col] = 'Q';
        solveNQueens(board, row + 1);
        board[row][col] = 'X';
      }
     
    }
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
  static int count=0;

  public static void main(String[] args) {
    int n = 64;
    char board[][] = new char[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = 'X';
      }
    }
    solveNQueens(board, 0);
    System.out.println("The total ways to solve n queens ="+count);
  }
  
}

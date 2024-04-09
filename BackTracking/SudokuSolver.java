public class SudokuSolver {

  public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
    // for row
    for (int i = 0; i < 9; i++) {
      if (sudoku[i][col] == digit) {
        return false;
      }
    }
    // for column
    for (int j = 0; j < 9; j++) {
      if (sudoku[row][j] == digit) {
        return false;
      }
    }
    // grid
    int sr = (row / 3) * 3;
    int sc = (col / 3) * 3;
    for (int i = sr; i < sr + 3; i++) {
      for (int j = sc; j < sc + 3; j++) {
        if (sudoku[i][j] == digit) {
          return false;
        }
      }
    }
    return true;
  }

  public static boolean sudokuSolver(int sudoku[][], int row, int col) {
    // base case
    if (row == 9) {
      return true;
    } else if (row == 9) {
      return false;
    }

    int nextRow = row, nextCol = col + 1;
    if (col + 1 == 9) {
      nextRow = row + 1;
      nextCol = 0;
    }

    // recursion
    // if there is already a number then
    if (sudoku[row][col] != 0) {
      return sudokuSolver(sudoku, nextRow, nextCol);
    }
    for (int digit = 1; digit <= 9; digit++) {
      if (isSafe(sudoku, row, col, digit)) {
        sudoku[row][col] = digit;
        if (sudokuSolver(sudoku, nextRow, nextCol)) { // solution exists
          return true;
        }
        sudoku[row][col] = 0;
      }
    }

    return false;
  }

  public static void printSudoku(int sudoku[][]) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(sudoku[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int arr[][] = {
      { 3, 1, 6, 5, 7, 8, 4, 9, 2 },
      { 5, 2, 9, 1, 3, 4, 7, 6, 8 },
      { 4, 8, 7, 6, 2, 9, 5, 3, 1 },
      { 2, 6, 3, 0, 1, 5, 9, 8, 7 },
      { 9, 7, 4, 8, 6, 0, 1, 2, 5 },
      { 8, 5, 1, 7, 9, 2, 6, 4, 3 },
      { 1, 3, 8, 0, 4, 7, 2, 0, 6 },
      { 6, 9, 2, 3, 5, 1, 8, 7, 4 },
      { 7, 4, 5, 0, 8, 6, 3, 1, 0 },
    };
    if (sudokuSolver(arr, 0, 0)) {
      System.out.println("soulution exits");
      printSudoku(arr);
    } else {
      System.out.println("solution does not exits");
    }
  }
}

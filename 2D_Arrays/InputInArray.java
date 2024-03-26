import java.util.Scanner;

public class InputInArray {
    public static void inputInarray(int matrix[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void printfunction(int matrix[][]) {
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean Isfound(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int n = 3;
        int m = 3;
        int matrix[][] = new int[n][m];
        inputInarray(matrix);
        printfunction(matrix);

        int keyToFind = 4;
        if (Isfound(matrix, keyToFind)) {
            System.out.println("Key " + keyToFind + " is found in the matrix.");
        } else {
            System.out.println("Key " + keyToFind + " is not found in the matrix.");
        }
    }
}

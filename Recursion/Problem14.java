package Recursion;

public class Problem14 {
    /* print all binary strings of size N without consecutive ones */
    public static void printBinaryStrings(int n, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Append '0' and recursively call with n-1
        printBinaryStrings(n - 1, str + "0");
        
        // If the last character of the current string is '0', append '1' and recursively call with n-1
        if (str.isEmpty() || str.charAt(str.length() - 1) == '0') {
            printBinaryStrings(n - 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBinaryStrings(3, "");
    }
}

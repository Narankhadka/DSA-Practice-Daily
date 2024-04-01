package Recursion_Assignment;


public class Question2 {
    private static final String[] digitNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printDigits(int number)
    {
        if (number==0) {
            return;
            }
            int lastdigit=number%10;
            printDigits(number/10);
            System.out.print(digitNames[lastdigit]+" ");
    }
    public static void main(String[] args) {
        printDigits(12);
        
    }

    
}

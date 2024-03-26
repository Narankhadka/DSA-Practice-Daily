package BitWiseOperator;

import java.util.Scanner;

public class EvenOdd {
    public static boolean evenOdd(int num)
    {
         return (num & 1)==0;
    }
    public static void main(String[] args) {

             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the number to check wheather odd or even");
             int num=sc.nextInt();
        if (evenOdd(num)) {
            System.out.println("Even number");
            
        }
        else
        {
            System.out.println("odd numbers");
        }
        
    }
    
}

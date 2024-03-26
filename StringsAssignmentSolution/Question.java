package StringsAssignmentSolution;


import java.util.Scanner;

//Question1:Count how many times lowercase vowels occurred in a String entered by the user
// vowel aeiou 
public class Question {
    public static int occuredVowel(String  str)
    {
        int couInteger=0;
        for(int i=0;i<str.length();i++)
        {
            if (str.charAt(i)=='a'|| str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
                couInteger++;
                 }
        }
        return couInteger;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  scBuilder=new String ();
        System.out.println("Enter the String ");
              scBuilder=sc.nextLine();

    System.out.println(occuredVowel(scBuilder));

        
    }
    
}

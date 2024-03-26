package StringsAssignmentSolution;

import java.util.Arrays;

public class Question4 {
    //Question 4 :Determine if 2 Strings are anagramsof each other.
    public static boolean isAnagrams(String str,String str1)
    {
        str.toLowerCase();
        str1.toLowerCase();
       
        if (str.length()==str1.length()) {
            char[] strToChar=str.toCharArray();
            char[] str2Tochar=str1.toCharArray();
            Arrays.sort(strToChar);
            Arrays.sort(str2Tochar);
            return Arrays.equals(strToChar, str2Tochar);
        }
        return false ;
    }
    public static void main(String[] args) {
        String str="rac2e";
        String str1="care";
       boolean result = isAnagrams(str,str1);
       System.out.println(result);
        
    }
}

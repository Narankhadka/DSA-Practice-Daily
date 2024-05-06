/**
 * The FindPermutation class in Java recursively finds and prints all permutations of a given string.
 */

public class FindPermutation {
    public static void findPermutation(String str,String ans)
    {
        //base case
        if(str.length()==0)
        {
         System.out.print(ans+" ");
         return;
        }
        // recursion
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            // abcde = ab+ de =abcd
            String newStr=str.substring(0, i)+str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPermutation(str, "");

    }
}

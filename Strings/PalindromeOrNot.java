public class PalindromeOrNot{
    public static boolean isPalindrome(String str)
    {
      //length of the string 
      int size= str.length();
      for(int i=0;i<size/2;i++)
      {
        if(str.charAt(i)!=str.charAt(size-1-i))
        {
            return false;
        }
    
      }
      return true;
    }
    public static void main(String args[])
    {
        String str;
        str="naran";
        boolean result=isPalindrome(str);
        System.out.print(result);
    }

}
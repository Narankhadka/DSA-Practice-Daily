public class FindSubset {
    public static void findSubset(String str,String ans ,int i)
    {
        // base case
        if (i==str.length()) {
            System.out.println(ans);
            return;
            
        }
        // choice yes
        findSubset(str, ans+str.charAt(i), i+1);
        //choice No
        findSubset(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str="abc";
        String ans="";
        findSubset(str, ans, 0);
        
        
    }
}
package Recursion;

public class Problem12 {
    // Remove Duplicates in Strings
    public static void removeDuplicate(String str, int idx , StringBuilder newstr,boolean[] map)
    {
        //Base cases
        if (idx==str.length()) {
            System.out.println(newstr);
            return;
         }
         //kam

         char currChar=str.charAt(idx);
         if (map[currChar-'a'] ==true ) {
            removeDuplicate(str, idx+1, newstr, map);
             }
             else{
                map[currChar-'a']=true;
                removeDuplicate(str, idx, newstr.append(currChar), map);
             }

    }
    public static void main(String[] args) {
        String str="appnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        
    }
    
}

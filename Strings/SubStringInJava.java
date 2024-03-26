public class SubStringInJava {
    public static String subStrings(String str,int si,int ei)
    {
        String subString="";
        for(int i=si;i<ei;i++)
        {
            subString+=str.charAt(i);
        }
        return subString;

    }
    public static void main(String[] args) {
        String str="Hello World";
       String subString= str.substring(0,4);
       System.out.println(subString);
       String newSubString=subStrings(str,0,4);
       System.out.println(newSubString);

    }
    
}

public class StringCompression {
    public static String comString(String str)
    {
        String newStr="";
         
        for(int i=0;i<str.length();i++)
        {
            int count =1;
            while (i<str.length()-1  &&str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++; 
            }
            newStr+=str.charAt(i);
            if (count>1) {
                   newStr+=count;
            }
        }
        return newStr;

    }
    public static String comString1(String  str)
    {
        StringBuilder scBuilder=new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            Integer couInteger=1;
            while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
                couInteger++;
                i++;     
            }
            scBuilder.append(str.charAt(i));
            if (couInteger>1) {
                scBuilder.append(couInteger);
                
            }
        }
        return scBuilder.toString();
    }
    public static void main(String[] args) {
        String str="aabbccc";
        System.out.println(comString(str));
        System.out.println(comString1(str));

    }
    
}

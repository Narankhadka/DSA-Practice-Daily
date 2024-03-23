

public class SerachInString {
    public static void main(String[] args) {
        String name="naran";
        char Target='n';
       boolean result= searchInString2(name,Target);
       System.out.println(result);
        
    }
    public static boolean searchInString(String name,char Target)
    {
        if (name.length()==0) {
            return false;    
        }
        for(int i=0;i<name.length();i++)
        {
            if (name.charAt(i)==Target) {
                return true;
          }
        }
        return false;

    }
    public static boolean searchInString2(String name, char Target)
    {
        if (name.length()==0) {
            
                return false;
            }
            for (char  ch : name.toCharArray()) {
                if (ch==Target) {
                    return true;
                    
                }
               }
               return false;
    }

    
}

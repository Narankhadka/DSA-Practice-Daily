public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sBuilder=new StringBuilder();
        for(char ch='a';ch<='z';ch++)
        {
            sBuilder.append(ch);
            //0(26)
        }
        System.out.println(sBuilder);

    }
}

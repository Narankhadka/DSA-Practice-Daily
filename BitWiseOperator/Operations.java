package BitWiseOperator;

public class Operations {

   
    public static int getIthBit(int n,int i)
{
    int bitMask=1<<i;
    
    if((n&bitMask)==0)
    {
        return 0;
    }
    else{
        return 1;
    }
}
public static int setItBit(int n,int i)
{
    int bitMask=1<<i;
    return n|bitMask;
}
public static int clearInt(int n,int i)
{
    int bitMask=~(1<<i);
    return n&bitMask;

}
public static int updateIthbit(int n,int i, int newbit)
{
    if (newbit==0) {
        return clearInt(n, i);
        
    }
    else
    {
        return setItBit(n, i);

    }

}
public static void main(String[] args) {
   
    System.out.println(clearInt(10, 2));




}
}

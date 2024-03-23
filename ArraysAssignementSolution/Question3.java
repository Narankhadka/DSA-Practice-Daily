
public class Question3 {
    public static int Maxprofit(int Stockprice[])
    {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<Stockprice.length;i++)
        {
            if (buyprice<Stockprice[i]) {
                int profit=Stockprice[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit); 
            }
            else{
                buyprice=Stockprice[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int Stockprice[]={8,5,1,4,3};
        System.out.println("Maximum profit is "+ Maxprofit(Stockprice));
    }
    
}

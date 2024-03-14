public class PairsInAnArray {
    public static void pairInArray(int array[])
    {
        int total_pair=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                System.out.print("("+array[i]+","+array[j]+")");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println("The total pair is "+total_pair);
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        pairInArray(array);
    }

    
}

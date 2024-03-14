public class LinearSearch{
    public static int  menus(String menu[],String key)
    {
        for(int i=0;i<menu.length;i++)
        {
            if (menu[i].equals(key)) {
                return i;
                
            }
        }
        return -1;

    }
    public static int  linearSeach(int numbers[],int keys){

        for(int i=0;i<numbers.length;i++)
        {
            if (numbers[i]==keys) {
                return i;   
            }
        }
        return -1;

    }
   
    public static void main(String[] args) {
        String menu[]={"dosa","chole","samosa","dalBhat"};
        String key="dosa";

        int numbers[]={2,4,6,8,10,34,54};
        int keys=10;
        int index=  linearSeach(numbers, keys);
        System.out.println(index);


        int index2=menus(menu, key);
        System.out.println(index2);

    }
}
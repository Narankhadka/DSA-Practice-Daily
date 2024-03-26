import java.util.*;
public class ShortestPath
{
   
    public static float getShortestPath(String path)
    {
         int x=0;
        int y=0;
        
        for(int i=0;i<path.length();i++)
        {
            char direction=path.charAt(i);
            // for checking the direction 
            //North
            if(direction=='N')
            {
                y++;
                
            }
            //South 
            else if(direction=='S')
            {
                y--;
            }
            //West 
            else if(direction=='W')
            {
                x--;
            }
            //East 
            else{
                x++;
            }
        }
    
    int x2=x*x;
    int y2=y*y;
    return (float) Math.sqrt(x2+y2);


    }

    public static void main(String args[])
    {

      String path;
      path="WNEENESENNN";
     float got= getShortestPath(path);
     System.out.print(got);

    }
}
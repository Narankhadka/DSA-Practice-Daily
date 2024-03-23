

public class Question1 {
    public static boolean isAppears(int nums[])
    {
        // int size=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if (nums[i]==nums[j]) {
                    return true;   
                }
              }
        }
     
        return false;

    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4}; 
        System.out.println(isAppears(nums));//should be false
        int nums1[]={1,2,3,1}; 
        System.out.println(isAppears(nums1));
       
    }
    
}

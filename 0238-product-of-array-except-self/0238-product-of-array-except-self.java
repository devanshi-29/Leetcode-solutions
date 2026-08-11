class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n=nums.length;
        int ans[]=new int[n];
        int pp[]=new int[n];
        int sp[]=new int [n];
         
        pp[0]=1;
       
        for(int i=1;i<n;i++)
        {
           pp[i]=nums[i-1]*pp[i-1];
        }
         
         sp[n-1]=1;
         
        for(int i=n-2;i>=0;i--)
        {
           sp[i]=nums[i+1]*sp[i+1];
        }
         
        for(int i=0;i<n;i++)
        {
            ans[i]=pp[i]*sp[i];
        }

        return ans;
    }
}
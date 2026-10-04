class Solution {
    public int findNumbers(int[] nums) 
    {
        
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int cdig=0;
            if(nums[i]==0) cdig=1;
            while(nums[i]!=0)
            {
                cdig++;
                nums[i]=nums[i]/10;
            }

            if(cdig%2==0) count++;
        }

        return count;
    }
}
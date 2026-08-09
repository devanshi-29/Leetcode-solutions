class Solution {
    public int minPairSum(int[] nums) 
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int freq[]=new int[100001];

        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
            freq[nums[i]]++;
        }

        int maxsum=0,l=min,r=max;
        while(l<=r)
        {
            if(freq[l]==0)l++;
            else if(freq[r]==0) r--;
            else 
            {
                maxsum=Math.max(maxsum,l+r);
                freq[l]--;
                freq[r]--;
            }
        }

        return maxsum;
    }
}
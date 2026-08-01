class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int minlen=Integer.MAX_VALUE;
        int high=0,low=0,sum=0;
        while(high<nums.length){
            sum+=nums[high];
            while(sum >=target){
                minlen=Math.min(high-low+1,minlen);
                sum-=nums[low];
                low++;
            }
            high++;
        }
        if(minlen==Integer.MAX_VALUE) return 0;
        return minlen;
    }
}
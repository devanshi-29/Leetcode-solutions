class Solution {
    public int maxSubarrayLength(int[] nums, int k) 
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int l=0,maxlen=0;
        for(int h=0;h<nums.length;h++){

            hm.put(nums[h],hm.getOrDefault(nums[h],0)+1);

            while(hm.get(nums[h])>k){
               hm.put(nums[l],hm.get(nums[l])-1);
               l++;
            }
           
            maxlen=Math.max(maxlen,h-l+1);
        }

        return maxlen;
    }
}
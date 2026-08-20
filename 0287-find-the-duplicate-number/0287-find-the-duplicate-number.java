class Solution {
    public int findDuplicate(int[] nums) 
    {
        int n=nums.length;
        int freq[]=new int[n];
        for(int x:nums){
          if(freq[x]==1) return x;
          freq[x]++;
        }

        return -1;

        
    }
}
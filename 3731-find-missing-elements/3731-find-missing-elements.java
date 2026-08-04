class Solution {
    public List<Integer> findMissingElements(int[] nums) 
    {
        ArrayList<Integer>ans=new ArrayList<>();
        HashSet <Integer> hs= new HashSet<>();
       Arrays.sort(nums);
       int min=nums[0];
       int max=nums[nums.length-1];
       for(int x:nums)
       {
         if(hs.add(x));
       }

       for(int i=min;i<=max;i++) 
       {
         if(!hs.contains(i)) ans.add(i);
       }

      return ans;
    }
}
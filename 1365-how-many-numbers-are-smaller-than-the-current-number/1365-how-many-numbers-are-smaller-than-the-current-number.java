class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
       int ans[]=new int[nums.length];
       for(int x:nums)
       {
         hm.put(x,hm.getOrDefault(x,0)+1);
       }

       int i=0;
       while(i<nums.length){
           int count=0;
           for(int key:hm.keySet()){
               if(nums[i]>key) count+=hm.get(key);
           }
           ans[i]=count;
           i++;
       }
       

       return ans;
    }
}
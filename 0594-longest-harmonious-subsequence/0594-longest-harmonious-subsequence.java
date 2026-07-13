class Solution {
    public int findLHS(int[] nums) 
    {
        int ans=0;
       HashMap<Integer,Integer>hm=new HashMap<>();
       for(int x:nums)
       {
         hm.put(x,hm.getOrDefault(x,0)+1);
       } 

       for(int key:hm.keySet())
       {
         if(hm.containsKey(key+1)){
            ans=Math.max(ans,hm.get(key)+hm.get(key+1));
         }
       }

       return ans;
    }
}
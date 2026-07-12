class Solution {
    public int findPairs(int[] nums, int k) 
    {
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums)
        {
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
    
        for(int key:hm.keySet())
        {
            if(k==0){
                   if(hm.get(key)>=2)
                    count++;
            }
            else 
            {
               if(hm.containsKey(key+k))
                   count++;
            }
            
        }

        return count;
    }
}
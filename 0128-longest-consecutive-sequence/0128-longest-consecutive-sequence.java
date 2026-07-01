class Solution {
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer>hs=new HashSet<>();
        for(int x:nums)
        {
            hs.add(x);
        }

        int maxlen=0;
        for(int x:hs)
        {
           if(!hs.contains(x-1)) // starting point x hai 
             {
                int len=1;
                while(hs.contains(x+len))// aage ke or check krenge 
                {
                    len++;
                }
                 maxlen=Math.max(maxlen,len);
             }             
        }

        return maxlen;
    }
}
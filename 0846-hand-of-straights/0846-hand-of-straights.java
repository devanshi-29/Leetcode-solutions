class Solution {
    public boolean isNStraightHand(int[] hand, int groupsize) 
    {
        if(hand.length % groupsize !=0) return false;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int x:hand)
        {
            hm.put(x,hm.getOrDefault(x,0)+1);
        }

        Arrays.sort(hand);
        for(int start:hand)
            {
               if(!hm.containsKey(start))
               continue;

               for(int i=start;i<start+groupsize;i++)
                {
                   if(!hm.containsKey(i)) return false;
                   else
                    {
                      hm.put(i,hm.get(i)-1);
                      if(hm.get(i)==0) hm.remove(i);
                    }
                } 
            }

        return true;
    }
}
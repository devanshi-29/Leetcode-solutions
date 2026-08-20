class Solution {
    public int findDuplicate(int[] nums) 
    {
        HashSet <Integer> hs=new HashSet<>();
        for(int x:nums){
          if(hs.contains(x)) return x;
          hs.add(x);
        }

        return -1;
        
        
    }
}
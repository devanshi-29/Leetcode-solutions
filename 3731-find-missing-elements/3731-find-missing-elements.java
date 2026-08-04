class Solution {
    public List<Integer> findMissingElements(int[] nums) 
    {
        ArrayList<Integer>ans=new ArrayList<>();
        HashSet <Integer> hs= new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
       for(int x:nums)
       {
          min=Math.min(min,x);
          max=Math.max(max,x);
          hs.add(x);
       }

       for(int i=min+1;i<max;i++) 
       {
         if(!hs.contains(i)) ans.add(i);
       }

      return ans;
    }
}
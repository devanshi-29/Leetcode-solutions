class Solution {
    public boolean canReorderDoubled(int[] arr) 
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int x:arr)
        {
          hm.put(x,hm.getOrDefault(x,0)+1);
        }

        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        Arrays.sort(nums, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));
        
        for(int x:nums)
        {
           if(hm.get(x)==0) continue;
           if(hm.getOrDefault(2*x,0)==0) return false;

           hm.put(x,hm.get(x)-1);
           hm.put(2*x,hm.get(2*x)-1);
           
        }

        return true;
    }
}
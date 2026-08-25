class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>hs=new HashSet<>();
        for(int x:nums){
            hs.add(x);
        }

        int curr=k;
        while(hs.contains(curr))
        {
           curr+=k;
        }

        return curr;
    }
}
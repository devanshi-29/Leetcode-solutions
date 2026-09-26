class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap <Integer,Integer>hm=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int x:nums){
            hm.put(x,(hm.getOrDefault(x,0))+1);
        }

        for(int x:hm.keySet()){
            if(hm.get(x)>n/3)
              ans.add(x);
        }

        return ans;
    }
}
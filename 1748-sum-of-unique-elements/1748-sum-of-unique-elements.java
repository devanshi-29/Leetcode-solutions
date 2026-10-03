class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int sum=0;
        for(int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }

        for(int x:hm.keySet()){
            if(hm.get(x)==1) sum+=x;
        }

        return sum;
    }
}
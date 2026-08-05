class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    public void combinations(int[]nums , int i, int target,ArrayList<Integer>temp){
        if(target==0)
        {
            ans.add(new ArrayList(temp));
            return;
        }

        if(i==nums.length) return;

        //consider
        if(nums[i]<=target)
        {
            temp.add(nums[i]);
            combinations(nums,i,target-nums[i],temp);
            temp.remove(temp.size()-1);
        }
        
        combinations(nums,i+1,target,temp);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) 
    {
        combinations(nums,0,target,new ArrayList<>());
        return ans;
    }
}
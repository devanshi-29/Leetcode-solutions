class Solution {
    public List<String> summaryRanges(int[] nums) 
    {
        List<String>ans=new ArrayList<>();

        if(nums.length == 0)
            return ans;

        int start=nums[0];

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]!=nums[i]+1){
               if(start==nums[i]) ans.add(String.valueOf(start));
               else
                 {
                    StringBuilder sb=new StringBuilder();
                    sb.append(start);
                    sb.append("->");
                    sb.append(nums[i]);
                    ans.add(sb.toString());
                 }

                 start=nums[i+1];
            }
        }

        //last range
            
            if(start==nums[nums.length-1]) ans.add(String.valueOf(start));
            else
             {
                    StringBuilder sb=new StringBuilder();
                    sb.append(start);
                    sb.append("->");
                    sb.append(nums[nums.length-1]);
                    ans.add(sb.toString());
             }
            

        return ans;
    }
}
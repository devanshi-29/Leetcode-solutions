class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int count1[]=new int[101];
        int count2[]=new int[101];
        int count3[]=new int[101];

        for(int x:nums1){
            count1[x]++;
        }

        for(int x:nums2){
            count2[x]++;
        }

        for(int x:nums3){
            count3[x]++;
        }

        for(int i=1;i<101;i++){
            if((count1[i] > 0 && count2[i] > 0) ||(count2[i] > 0 && count3[i] > 0) ||(count1[i] > 0 && count3[i] > 0))
             ans.add(i);
        }

        return ans;
    }
}
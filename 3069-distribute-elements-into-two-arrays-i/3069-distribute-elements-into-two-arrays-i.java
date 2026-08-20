class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);
        int i=2;
        while(i<n){
            if(a.get(a.size()-1) > b.get(b.size()-1))
              a.add(nums[i]);
            else 
              b.add(nums[i]);
            i++;
        }
        
        int k=0;
        for(int j = 0; j < a.size(); j++) {
          nums[k++] = a.get(j);
         }

         for(int j = 0; j < b.size(); j++) {
          nums[k++] = b.get(j);
         }

         return nums;
        
    }
}
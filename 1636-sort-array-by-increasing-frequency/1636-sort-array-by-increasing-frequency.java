class Solution {
    public int[] frequencySort(int[] nums) 
    {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
         // sort humara obj pe work krta hai isliye integer not int
        Integer[]arr=new Integer[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b)->{
            //freq is same larger value comes first
           if(hm.get(a).equals(hm.get(b)))
              return b - a;
            //smaller freq comes first
            return hm.get(a)-hm.get(b);
        });
         //copy sorted elements back to nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        int n=nums.length;
        List<List<Integer>>list=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int x: nums)
        {
           hm.put(x,hm.getOrDefault(x,0)+1);
        }

        for(int key:hm.keySet())
        {
            ArrayList<Integer>temp=new ArrayList<>();
            temp.add(key);
            temp.add(hm.get(key));

            list.add(temp);
        }

        list.sort((a,b)->b.get(1)-a.get(1));
         int ans[]=new int[k];
        for(int i=0;i<k;i++)
        {
           ans[i]=list.get(i).get(0);
        }

        return ans;
    }
}
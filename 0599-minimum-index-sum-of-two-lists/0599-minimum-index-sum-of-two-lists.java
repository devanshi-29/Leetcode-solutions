class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) 
    {
        HashMap<String,Integer>hm=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            String s=list1[i];
            hm.put(s,i);
        }
        int minsum=Integer.MAX_VALUE;
        List<String>ans=new ArrayList<>();
        for(int i=0;i<list2.length;i++)
        {
            String x=list2[i];
            if(hm.containsKey(x)){

                int sum=hm.get(x)+i;

                if(minsum>sum){
                    minsum=sum;
                    ans.clear();
                    ans.add(x);
                }

                else if(minsum==sum)
                  ans.add(x);
            }
        }

        return ans.toArray(new String[0]);
    }
}
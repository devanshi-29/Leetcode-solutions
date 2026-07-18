class Solution {
    public List<String> topKFrequent(String[] words, int k) 
    {
        List<String>temp=new ArrayList<>();
        List<String>ans=new ArrayList<>();
        HashMap<String,Integer>hm=new HashMap<>();
        for(String s:words)
        {
            hm.put(s,hm.getOrDefault(s,0)+1);
        }

        for(String s:hm.keySet()){
            temp.add(s);
        }

        Collections.sort(temp,(a,b)->{
          if(hm.get(a)!=hm.get(b)) return hm.get(b)-hm.get(a); //descending order
          return a.compareTo(b);
        });
        
        for(int i=0;i<k;i++)
        {
            ans.add(temp.get(i));
        }

        return ans;
    }
}
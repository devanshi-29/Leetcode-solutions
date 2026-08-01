class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        int l=0,k=p.length();
        HashMap<Character,Integer> phm=new HashMap<>();
        HashMap<Character,Integer> shm=new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        if(s.length()<p.length())
          return new ArrayList<>();

        for(int i=0;i<p.length();i++)
        {
            char ch=p.charAt(i);
            phm.put(ch,phm.getOrDefault(ch,0)+1);
        }

        for(int h=0;h<s.length();h++)
        {
            char ch=s.charAt(h);
            shm.put(ch,shm.getOrDefault(ch,0)+1);
            
            if(h-l+1>k){
                char c=s.charAt(l);
                shm.put(c,shm.get(c)-1);
                if(shm.get(c)==0)
                  shm.remove(c);
                l++;
            }

            if(h-l+1==k){
                if(shm.equals(phm))
                    ans.add(l);                 
            }            
           
        }

        return ans;

    }
}
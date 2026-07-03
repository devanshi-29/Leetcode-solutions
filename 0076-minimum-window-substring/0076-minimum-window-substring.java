class Solution {
    public String minWindow(String s, String t) 
    {
        int n=s.length(),m=t.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            char ch=t.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int l=0,count=m,start=0,ans=Integer.MAX_VALUE;
        for(int h=0;h<n;h++)
        {
            char ch=s.charAt(h);
            if(hm.containsKey(ch))
            {
                if(hm.get(ch)>0) count--;
                hm.put(ch,hm.get(ch)-1); 
            }

            while(count==0)
            {
              if(h-l+1<ans)
              {
                ans=h-l+1;
                start=l;
              }
              char lc=s.charAt(l);
              if(hm.containsKey(lc))
              {
                hm.put(lc,hm.getOrDefault(lc,0)+1);
                if(hm.get(lc)>0) count++;
              }
              l++;
            }
        }
        if(ans==Integer.MAX_VALUE) return "";
        return s.substring(start,start+ans);
    }
}
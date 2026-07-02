class Solution 
{
    class pair 
    {
       char ch;
        int freq;

       pair(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
       }
    }
    public String frequencySort(String s) 
    {
        int n=s.length();
        List<pair>list=new ArrayList<>();
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
           char x=s.charAt(i);
           hm.put(x,hm.getOrDefault(x,0)+1);
        }

        for(char key:hm.keySet())
        {
            list.add(new pair(key,hm.get(key)));
        }

        list.sort((a,b)->b.freq-a.freq);
        StringBuilder sb=new StringBuilder();
        for(pair p:list)
        {
            for(int i=0;i<p.freq;i++)
            {
              sb.append(p.ch);
            }
        }

        return sb.toString();
    }
}
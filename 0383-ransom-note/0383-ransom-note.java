class Solution {
    public boolean canConstruct(String rn, String magazine) 
    {
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            char x=magazine.charAt(i);
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
         
        for(int i=0;i<rn.length();i++)
        {
            char x=rn.charAt(i);
            if(hm.containsKey(x))
             {
                hm.put(x,hm.get(x)-1);
                if(hm.get(x)==0) hm.remove(x);
             }

             else return false;
        }
        
        return true;
    }
}
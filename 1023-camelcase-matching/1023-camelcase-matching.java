class Solution {
    public boolean match(String s,String p)
    {
        int i=0,j=0; 
           while( i<s.length())
           {
             if(j<p.length() && s.charAt(i)==p.charAt(j)) 
             {
                j++;
                i++;
             }

             //ignore extra lowercase 
             else if(Character.isLowerCase(s.charAt(i))) i++;

             //extra uppercase
             else return false;
           }          
           return j==p.length();
    }
    public List<Boolean> camelMatch(String[] queries, String p) 
    { 
        List<Boolean> ans=new ArrayList<>();
        for(String s:queries)
        {
           ans.add(match(s,p));
        }

        return ans;
    }
}
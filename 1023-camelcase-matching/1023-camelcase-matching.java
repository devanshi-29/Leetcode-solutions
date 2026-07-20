class Solution {
    public List<Boolean> camelMatch(String[] queries, String p) 
    { 
        List<Boolean> ans=new ArrayList<>();
        for(String s:queries)
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
             else break;
           }
            
           if (i != s.length()) {
                ans.add(false);
              }
           else if(j==p.length()) ans.add(true);
           else ans.add(false);
        }

        return ans;
    }
}
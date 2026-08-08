class Solution {
    public boolean isPrefixString(String s, String[] words) 
    {
      StringBuilder sb=new StringBuilder();
      for(String a:words)
      {
        sb.append(a);
        if(s.equals(sb.toString())) return true;
      }  

      return false;
    }
}
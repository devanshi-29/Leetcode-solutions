class Solution {
    public int countConsistentStrings(String allowed, String[] words) 
    {
      int freq[]=new int[26];
      for(int i=0;i<allowed.length();i++)
      {
        char x=allowed.charAt(i);
       freq[x-'a']=1;
      }  
      
      int count=0;
      for(String s:words)
      {
        int flag=1;
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(freq[x-'a']==0) {
                flag=0;
                break;
           }   
        }

        count+=flag;
      }

      return count;
    }
}

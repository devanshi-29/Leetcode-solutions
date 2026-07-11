class Solution {
    public boolean checksubset(int req[],int freqa[])
    {
        for(int i=0;i<26;i++)
              {
                if(req[i]>freqa[i]) return false;
              }
        return true;
    }
    public List<String> wordSubsets(String[] words1, String[] words2) 
    {
        List<String> ans=new ArrayList<>();
        //stores max freq
        int req[]=new int[26];
        for(int i=0;i<words2.length;i++)
        {
            int freq[]=new int[26];
            String s=words2[i];
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                freq[ch-'a']++;
            }
            for(int k=0;k<26;k++)
              {
                req[k]=Math.max(req[k],freq[k]);
              }
            
        }
        
        for(int i=0;i<words1.length;i++)
        {
            int freqa[]=new int[26];
            String s=words1[i];
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                freqa[ch-'a']++;
            }
            if(checksubset(req,freqa))
            {
              ans.add(words1[i]);
            }
        }
         return ans;

    }
}
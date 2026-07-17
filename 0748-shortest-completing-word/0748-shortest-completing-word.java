class Solution {
    public String shortestCompletingWord(String lp, String[] words) 
    {
        lp=lp.toLowerCase();
        int freq[]=new int[26];
        for(int i=0;i<lp.length();i++){
            char ch=lp.charAt(i);
            if(ch>='a' && ch<='z')
            {
                freq[ch-'a']++;
            }
        }
         String min="";
         int minlen=Integer.MAX_VALUE;

        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            int temp[]=freq.clone();
            for(int j=0;j<s.length();j++)
            {
                char x=s.charAt(j);
                temp[x-'a']--;
            }
             boolean contains=true;
            for(int k=0;k<26;k++){
                if(temp[k]>0)
                {
                    contains=false;
                    break;
                } 
            }

            if(contains && s.length() < minlen){
                min=s;
                minlen=s.length();
            }
        }


        return min;

    }
}
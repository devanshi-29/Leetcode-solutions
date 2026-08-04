class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character>hs=new HashSet();
        int l=0,maxlen=0;
        for(int h=0;h<s.length();h++){
            char x=s.charAt(h);
            while(hs.contains(x)){
              hs.remove(s.charAt(l));
              l++;
            }           
            hs.add(x);
            maxlen=Math.max(maxlen,h-l+1);
        }

        return maxlen;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character>hs=new HashSet();
        int l=0,h=0,maxlen=0;
        while(h < s.length()){
            while(hs.contains(s.charAt(h))){
              hs.remove(s.charAt(l));
              l++;
            }           
            hs.add(s.charAt(h));
            maxlen=Math.max(maxlen,h-l+1);
            h++;
        }

        return maxlen;
    }
}
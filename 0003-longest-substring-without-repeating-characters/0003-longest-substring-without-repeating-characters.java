class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashMap<Character,Integer>hm=new HashMap();
        int l=0,h=0,maxlen=0;
        while(h < s.length()){
            if(hm.containsKey(s.charAt(h))){
              l=Math.max(l,hm.get(s.charAt(h))+1);
            }           
            hm.put(s.charAt(h),h);
            maxlen=Math.max(maxlen,h-l+1);
            h++;
        }

        return maxlen;
    }
}
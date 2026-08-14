class Solution {
    public int maximumLengthSubstring(String s) 
    {
        int l=0,maxlen=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int h=0;h<s.length();h++){
            char ch=s.charAt(h);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while(hm.get(ch)>2){
                char x=s.charAt(l);
                hm.put(x,hm.get(x)-1);
                l++;
            }

            maxlen=Math.max(maxlen,h-l+1);
        }

        return maxlen;
    }
}
class Solution {
    public boolean wordPattern(String p, String s) 
    {
        HashMap<Character,String>hm=new HashMap<>();
        String arr[]= s.split(" ");
        if(p.length()!=arr.length) return false;
        for(int i=0;i<p.length();i++)
        {
           char ch= p.charAt(i);
           if(hm.containsKey(ch)){
              if(!hm.get(ch).equals(arr[i])) return false;
           }

           else{
                if(hm.containsValue(arr[i])) return false;
                hm.put(ch,arr[i]);
           }
        }

        return true;
    }
}
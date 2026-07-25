class Solution {
    public int countCharacters(String[] words, String chars) 
    {
        HashMap<Character,Integer>hm=new HashMap();
        int res=0;
        for(int i=0;i<chars.length();i++)
        {
           char ch=chars.charAt(i);
           hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<words.length;i++){
           String s=words[i];
           HashMap<Character,Integer>copy=new HashMap(hm);
           for(int j=0;j<s.length();j++)
           {
             char ch=s.charAt(j);
             if(copy.containsKey(ch) && copy.get(ch)!=0)
                copy.put(ch, copy.get(ch) - 1);

             else{
                res-=s.length();
                break;
             }
           }   

            res+=s.length();              
        }

        return res;
    }
}
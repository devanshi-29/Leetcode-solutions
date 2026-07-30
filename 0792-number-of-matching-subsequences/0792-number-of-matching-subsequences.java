class Solution {
    public int numMatchingSubseq(String s, String[] words) 
    {
        HashMap<String,Integer>hm=new HashMap<>();
        for(String str:words)
        {
            hm.put(str,hm.getOrDefault(str,0)+1);
        }
        int count=0;
        char arr[]=s.toCharArray();
        for(String a:hm.keySet())
        {
            char str[]=a.toCharArray();
            int i=0,j=0;
            while(i<arr.length && j<str.length)
            {
                if(arr[i]==str[j]) j++;
                i++;                
            }
             
            if(j==str.length) count+=hm.get(a);
            
        }
        
        return count;
    }
}
class Solution {
    public int isPrefixOfWord(String s, String searchWord) 
    {
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            String a=arr[i];
            if(a.startsWith(searchWord)) return i+1;
        }

        return -1;
    }
}
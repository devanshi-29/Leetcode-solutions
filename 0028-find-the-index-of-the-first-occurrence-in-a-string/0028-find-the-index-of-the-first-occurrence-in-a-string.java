class Solution {
    public int strStr(String s, String p) 
    {
        int n=s.length();
        int m=p.length();
        if(n<m) return -1;
        for(int i=0;i<=n-m;i++)
        {
            int j=0;
            while(j<m && s.charAt(i + j) == p.charAt(j)) j++;

            if(j==m) return i;
        }
       return -1;
    }
}
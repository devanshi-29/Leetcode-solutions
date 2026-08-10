class Solution {
    public boolean isSubseq(String s, char [] brr,int k,int n,int m, int[] rem)
    {
        char []arr=s.toCharArray();
        for(int i=0;i<k;i++)
        {
            arr[rem[i]]='*';
        }

        int i = 0, j = 0;

        while(i < n && j < m){

            if(arr[i] == brr[j]){

                j++;
            }

            i++;
        }
         

         return j==m;

    }
    public int maximumRemovals(String s, String p, int[] rem) 
    {
        int n=s.length(),m=p.length();
        char []brr=p.toCharArray();
        int st=0,end=rem.length;
        int ans=0;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isSubseq(s,brr,mid,n,m,rem)) {
                ans=mid;
                st=mid+1;
            }
            else end=mid-1;
        }

        return ans;
    }
}
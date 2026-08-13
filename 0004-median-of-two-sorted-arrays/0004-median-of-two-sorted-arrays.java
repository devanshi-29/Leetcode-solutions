class Solution {
    public double findMedianSortedArrays(int[]a, int[]b) 
    {
        int m=a.length,n=b.length;
        int [] merged=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n)
        {
            if(a[i]< b[j])
            {
                merged[k++]=a[i++];
            }
            else
               merged[k++]=b[j++];
        }

        while(i<m) {
            merged[k++]=a[i++];
        }
        while(j<n){
           merged[k++]=b[j++];
        }
        
        double ans=0;
        int total=m+n;
        if(total%2==0)
        {
            ans=(merged[total/2]+merged[total/2-1])/2.0;
        }
        else
        {
            ans=merged[total/2];
        }
        
        return ans;
    }
}
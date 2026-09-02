class Solution {
    public int eraseOverlapIntervals(int[][] a) 
    {
        Arrays.sort(a,(b,c)-> b[1]-c[1]);
        int count=0;
        int n=a.length;
        int end1=a[0][1];
        for(int i=1;i<n;i++)
        {
           if(end1>a[i][0]) count++;
           else end1=a[i][1];
        }

        return count;
    }
}
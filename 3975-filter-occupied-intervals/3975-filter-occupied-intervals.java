class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] a, int fs, int fe) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        List<List<Integer>> merged=new ArrayList<>();
        Arrays.sort(a,(b,c)->Integer.compare(b[0], c[0]));
        int s1=a[0][0];
        int e1=a[0][1];
        for(int i=1;i<a.length;i++)
            {
                int s2=a[i][0];
                int e2=a[i][1];
                if(s2<=e1+1)
                {
                    e1=Math.max(e1,e2);
                }
                else
                {
                   
                    merged.add(Arrays.asList(s1,e1));
                    e1=e2;
                    s1=s2;
                }
            }
        merged.add(Arrays.asList(s1, e1));
        for(List<Integer> interval : merged)
         {
    int l = interval.get(0);
    int r = interval.get(1);

    //non overlap
    if(r < fs || l > fe)
    {
        ans.add(Arrays.asList(l, r));
    }
    else
    {
        // left part remains
        if(l < fs)
        {
            ans.add(Arrays.asList(l, fs - 1));
        }

        // right part remains
        if(r > fe)
        {
            ans.add(Arrays.asList(fe + 1, r));
        }
    }

         }

        return ans;
    }
}
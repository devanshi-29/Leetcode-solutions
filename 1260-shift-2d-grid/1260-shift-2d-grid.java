class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) 
    {
        int r=grid.length,c=grid[0].length;
        k %= (r * c);
        while(k>0)
        {
           int a[][]=new int[r][c];
           for(int i=0;i<r;i++)
           {
             for(int j=0;j<c;j++)
             {
                if(j!=c-1) 
                 {
                    a[i][j+1]=grid[i][j];
                 }
                 else
                 {
                    if(i!=r-1) 
                       a[i+1][0]=grid[i][j];
                    else 
                       a[0][0]=grid[i][j];
                 }
             }
           }
           grid=a;
           k--; 
        }
       
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < r; i++)
        {
            List<Integer> list = new ArrayList<>();

            for(int j = 0; j < c; j++)
            {
                list.add(grid[i][j]);
            }

            ans.add(list);
        }

        return ans;

    }
}
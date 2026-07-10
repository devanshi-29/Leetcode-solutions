class Solution {
    public int numFriendRequests(int[] age) 
    {
        int count=0;
        int n=age.length;
        int freq[]=new int[121];
        for(int i=0;i<n;i++)
        {
            freq[age[i]]++;
        }
        for(int x=1;x<=120;x++)
        {
            if(freq[x]==0) continue;
            for(int y=1;y<=120;y++)
            {
                if(freq[y]==0)continue;
                boolean cond1=y<=(0.5*x+7);
                boolean cond2=y>x;
                boolean cond3=y>100 && x<100;

                if(!(cond1 || cond2 ||cond3)) 
                   {
                     if (x == y)
                        count += freq[x] * (freq[x] - 1);
                     else
                        count += freq[x] * freq[y];
                   }

            }
        }
        return count;
    }
}
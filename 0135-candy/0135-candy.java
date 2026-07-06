class Solution {
    public int candy(int[] r) 
    {
        int n=r.length,sum=0;
        int candy[]=new int[n];
        //assign 1 candy to each
        for(int i=0;i<n;i++)
        {
            candy[i]=1;
        }
        //left se count
        for(int i=1;i<n;i++)
        {
          if(r[i-1]<r[i])
             candy[i]=candy[i-1]+1;
        }

        //right se count
        for(int i=n-2;i>=0;i--)
        {
            if(r[i+1] < r[i])
             candy[i]=Math.max(candy[i],candy[i+1]+1);
        }

        //total candy
        for(int i=0;i<n;i++)
        {
            sum+=candy[i];
        }
        return sum;
    }
}
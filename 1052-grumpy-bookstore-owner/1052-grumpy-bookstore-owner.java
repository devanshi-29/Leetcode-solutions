class Solution {
    public int maxSatisfied(int[] cust, int[] grum, int min) 
    {
        int initialsat=0;
        for(int i=0;i<cust.length;i++)
        {
          if(grum[i]==0) initialsat+=cust[i];
          else grum[i]*=cust[i];
        }
        int maxsat=0,sum=0;
        int low=0,high=0;
        while(high<grum.length){
          
          if(high-low+1>min){
            sum-=grum[low];
            low++;
          }

            sum+=grum[high];
            high++;
            maxsat=Math.max(maxsat,sum+initialsat);
          
        }

        return maxsat;
    }
}
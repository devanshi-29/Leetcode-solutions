class Solution {
    public int maxProfit(int[] prices) 
    {
        int prof=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++)
        {
           if(buy<prices[i]){
             int currprof=prices[i]-buy;
             prof=Math.max(prof,currprof);
           }

           else if(buy>prices[i]) buy=prices[i];
        }

        return prof;
    }
}
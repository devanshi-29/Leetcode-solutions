class Solution {
    public int[] finalPrices(int[] p) {
        int [] ans=new int [p.length];
        
        ans[p.length-1]=p[p.length-1];
        for(int i=0;i<p.length-1;i++)
        {  
            int j=i+1;
           ans[i]=p[i];
           while(j<p.length)
           {
             if(p[i]>=p[j]){
              ans[i]=p[i]-p[j];
              break;
              } 
             j++;
           }

        }

        return ans;
    }
}
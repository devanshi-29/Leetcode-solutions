class Solution {
    public int trap(int[] h) 
    {
        int n=h.length;
        int i=0,j=n-1;
        int leftmax=0;
        int rightmax=0;
        int water=0;

        while(i<=j)
        {
            if(h[i] < h[j])
            {
              if(h[i]>=leftmax) leftmax=h[i];
              else water+=leftmax-h[i];
              i++;
            }
            else
            {
              if(h[j]>=rightmax) rightmax=h[j];
              else water+=rightmax-h[j];
              j--;
            }

        }

        return water;
    }
}
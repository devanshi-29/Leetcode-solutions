class Solution {
    public boolean checkDivisibility(int n) 
    {
        int x=n;
        int sum=0,prod=1;
        while(x > 0)
        {
            int dig=x%10;
            sum+=dig;
            prod*=dig;
            x=x/10;
        }

        return n%(sum+prod)==0;
    }
}
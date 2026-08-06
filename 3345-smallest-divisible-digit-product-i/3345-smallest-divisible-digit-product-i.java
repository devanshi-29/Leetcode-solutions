class Solution {
    public int product(int n)
    {
        int prod=1;
        while(n>0)
        {
            int dig=n%10;
            prod*=dig;
            n=n/10;
        }

        return prod;
    }
    public int smallestNumber(int n, int t) {
        
        while(product(n)%t!=0){
            n++;
        }

        return n;
    }
}
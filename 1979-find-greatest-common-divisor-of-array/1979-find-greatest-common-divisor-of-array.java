class Solution {
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }

        return a;
    }
    public int findGCD(int[] nums) 
    {
        int min=1001;
        int max=0;
        for(int x:nums)
        {
            min=Math.min(min,x);
            max=Math.max(max,x);
        }

        return gcd(min,max);
    }
}
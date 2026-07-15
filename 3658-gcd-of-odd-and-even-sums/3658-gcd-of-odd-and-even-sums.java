class Solution {
    public int GCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) 
    {
        int sumo=0,sume=0;
        for(int i=1;i<2*n;i+=2)
        {
          sumo+=i;
        }
        for(int i=2;i<=2*n;i+=2)
        {
          sume+=i;
        }

        return GCD(sumo,sume);

    }
}
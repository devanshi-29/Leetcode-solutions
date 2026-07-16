class Solution {
    public int gcd(int a,int b){
        while(b!=0)
        {
          int temp=b;
          b=a%b;
          a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) 
    {
        int mxi=0;
        int prefgcd[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           mxi=Math.max(mxi,nums[i]);
           prefgcd[i]=gcd(nums[i],mxi);
        }

        Arrays.sort(prefgcd);
        long sum=0;
        int i=0,j=nums.length-1;
        while(i<=j){
            if(i==j) break;
            sum+=gcd(prefgcd[i],prefgcd[j]);
            i++;
            j--;
        }
        
        return sum;
    }
}
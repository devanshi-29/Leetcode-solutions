class Solution {
    public int numPairsDivisibleBy60(int[] time) {
       int freq[]=new int [60];
       int count=0;
       for(int x:time)
       {
         int rem=x%60;
         int need=(60-rem)%60;
         count+=freq[need];
         freq[rem]++;
       }

       return count;       
    }
}
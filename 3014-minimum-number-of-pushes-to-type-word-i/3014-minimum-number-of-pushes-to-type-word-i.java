class Solution {
    public int minimumPushes(String word) 
    {
        int n=word.length();
        int blocks=n/8;
        //8*1 + 8*2 + ------ + 8*n ==== 8(sum of n number)== 8 * n(n+1)/2
        // 4 * blocks * (blocks+1)
        return 4 * blocks * (blocks+1) + (n%8) * (blocks+1);
    }
}
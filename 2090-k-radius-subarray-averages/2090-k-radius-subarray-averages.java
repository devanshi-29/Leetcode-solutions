class Solution {
    public int[] getAverages(int[] nums, int k) 
    {
        int avg[]=new int[nums.length];
        int st=0,end=0,x=0;
        long sum=0;

        if(k == 0) return nums;

        while(x<k && x < nums.length){
            avg[x++] = -1;
        }

        if(nums.length < 2 * k + 1) {
            while(x < nums.length) {
                avg[x++] = -1;
            }
            return avg;
        }

        while(end<=2*k)
        {
            sum+=nums[end];
            end++;
        }

        avg[k] = (int)(sum / (2 * k + 1));
        x = k + 1;

        while(end<nums.length)
        {
            sum-=nums[st];
            st++;
            sum+=nums[end];

            avg[x++]=(int)(sum/(2*k+1));
            end++;
        }

        while(x < nums.length){
            avg[x++]=-1;
        }

        return avg;
    }
}
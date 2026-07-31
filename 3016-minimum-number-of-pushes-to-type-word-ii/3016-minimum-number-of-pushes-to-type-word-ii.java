class Solution {
    public int minimumPushes(String word) 
    {
        int [] freq=new int[26];
        char arr[]=word.toCharArray();
        for(char ch:arr){
            freq[ch-'a']++;
        }

        Arrays.sort(freq);
        int totalpush=0;
        int pushcount=0;
        for(int i=25;i>=0;i--)
        {
           int curridx=25-i;

           if(curridx%8==0) pushcount++;

           totalpush+=freq[i]*pushcount;
        }
         
         return totalpush;

    }
}
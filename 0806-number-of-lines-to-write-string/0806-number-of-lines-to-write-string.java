class Solution {
    public int[] numberOfLines(int[] widths, String s) 
    {
        int sum=0,count=1;
        for(int i=0;i<s.length();i++){
            int width=widths[s.charAt(i)-'a'];

           if(sum + width<=100){
             sum+=width;
           }

           else{
             count++;
             sum=width;
           }
        }
        return new int[] {count,sum};
    }
}
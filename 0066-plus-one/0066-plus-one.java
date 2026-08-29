class Solution {
    public int[] plusOne(int[] dig) 
    {
       for(int i=dig.length-1;i>=0;i--){
        if(dig[i]!=9){
            dig[i]+=1;
            return dig;
         }

          dig[i]=0;
       }

       dig=new int [dig.length+1];
       dig[0]=1;
       return dig;
    }
}
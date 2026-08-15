class Solution {
    public boolean squareIsWhite(String s) {
        char ch=s.charAt(0);
        int n=s.charAt(1)-'a';
        boolean ans=false;
        if((ch-'a')%2==0){
            if(((ch-'a')+n)%2!=0) ans=true;
        }
        else 
        {
            if(((ch-'a')+n)%2!=0) ans=true;
            
        }

        return ans;

    }
}
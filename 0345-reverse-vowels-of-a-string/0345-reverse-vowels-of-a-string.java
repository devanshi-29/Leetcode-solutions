class Solution {
    public boolean isvowel(char ch){
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I'  || ch=='O' || ch=='U' )     return true;
        return false;
    }
    public String reverseVowels(String st) 
    {
        char s[]=st.toCharArray();
       int i=0,j=s.length-1;
       while(i<j){
           
           if(!isvowel(s[i])) i++;
           else if(!isvowel(s[j])) j--;

           else if(isvowel(s[i]) && isvowel(s[j])) {
              char temp=s[i];
              s[i]=s[j];
              s[j]=temp;
              i++;
              j--;
           }
       }

       StringBuilder sb=new StringBuilder();
           for(char x:s){
              sb.append(x);
           }

       return sb.toString();
    }
}
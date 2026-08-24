class Solution {
    public String addBinary(String a, String b) 
    {
        int i=a.length()-1,j=b.length()-1;
        int carry=0,sum=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0 || j>=0 || carry>0){
            int n1=i>=0 ? a.charAt(i)-'0' : 0;
            int n2=j>=0 ? b.charAt(j)-'0' : 0;
             
            sum=n1+n2+carry;
            int digit=sum%2;
            carry=sum/2;
            i--;
            j--;
            
            sb.append((char)(digit+'0'));
        }
        
        return sb.reverse().toString();


    }
}
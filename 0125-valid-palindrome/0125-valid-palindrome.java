class Solution 
{
    public boolean isPalindrome(String s) 
    {
       StringBuilder sb=new StringBuilder();
       s=s.toLowerCase();
       char arr[]=s.toCharArray();
       for(char x:arr){
          if(Character.isLetterOrDigit(x)) sb.append(x);
       }

       String a=sb.toString();
       String b=sb.reverse().toString();

       return a.equals(b);

    }
}
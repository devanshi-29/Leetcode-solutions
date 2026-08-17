class Solution {
    public String modifyString(String s) 
    {   
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            char ch='a';
            if(arr[i]=='?')
            {
               while ((i>0 && arr[i-1]==ch )|| (i<arr.length-1 && arr[i+1]==ch)){
                    ch++;
               }
                arr[i]=ch;
            }
            
        }

        return new String (arr);
    }
}
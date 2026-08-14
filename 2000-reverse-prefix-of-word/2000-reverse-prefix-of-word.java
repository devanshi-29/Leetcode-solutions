class Solution {
    public String reversePrefix(String word, char ch) 
    {
        char arr[]=word.toCharArray();
        int j=0;
        while(j<arr.length && arr[j]!=ch) j++;
        if(j==arr.length) return word;
        int i=0;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        return new String(arr);
          
    }
}
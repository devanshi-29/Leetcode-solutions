class Solution {
    public boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
           ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') return true;

        return false;
    }
    public boolean halvesAreAlike(String s) 
    {
        int first=0,second=0;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length/2;i++){
            if(isVowel(a[i])) first++;
        }

        for(int i=a.length/2;i<a.length;i++){
            if(isVowel(a[i])) second++;
        }

        return first==second;

    }
}
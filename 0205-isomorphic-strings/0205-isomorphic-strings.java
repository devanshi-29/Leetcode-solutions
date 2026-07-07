class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        //stores last occurence
        int lastoccs[]=new int[200];
        int lastocct[]=new int[200];  

        int n=s.length();
        if(t.length()!=n) return false;

        for(int i=0;i<n;i++)
        {
            if(lastoccs[s.charAt(i)]!=lastocct[t.charAt(i)])  //pehle bhi replace ho chuke h
            {
                return false;
            }

            lastoccs[s.charAt(i)]=i+1;  // 0 idx ke liye 0 hi rhega agr i rakha toh fir pta nhi lga paenge ki pehle aaya ya nhi isliye i+1;
            lastocct[t.charAt(i)]=i+1;
        }

        return true;
    }
}
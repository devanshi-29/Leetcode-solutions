class Solution {
    public int busyStudent(int[] st, int[] et, int qt) 
    {
        int count=0;
        for(int i=0;i<st.length;i++)
        {
            if(st[i]<=qt && et[i]>=qt) count++;
        }
        return count;
    }
}
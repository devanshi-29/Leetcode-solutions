class Solution {
    public int maxActiveSectionsAfterTrade(String s) 
    {
        int curr0count=0,last0count=0,converted1=0,count1=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='0') curr0count++;
            else
            {
                if(curr0count!=0)last0count = curr0count;
                curr0count=0;
                count1++;
            }

            converted1=Math.max(converted1,curr0count+last0count);
        }

        if(converted1==last0count || converted1==curr0count) return count1;
        return count1+converted1;

    }
}
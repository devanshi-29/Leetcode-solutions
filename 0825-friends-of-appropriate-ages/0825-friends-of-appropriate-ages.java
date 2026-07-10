class Solution {
    public int numFriendRequests(int[] age) 
    {
        int count=0;
        int n=age.length;
        int freq[]=new int[121];
        for(int i=0;i<n;i++)
        {
            freq[age[i]]++;
        }
        for(int A=1;A<=120;A++)
        {
            if(freq[A]==0) continue;
            for(int B=1;B<=120;B++)
            {
                if(freq[B]==0)continue;

                if (B <= 0.5 * A + 7)
                    continue;

                if (B > A)
                    continue;

                if (B > 100 && A < 100)
                    continue;

        
                if (A == B)
                        count += freq[A] * (freq[A] - 1);
                else
                        count += freq[A] * freq[B];
                   

            }
        }
        return count;
    }
}
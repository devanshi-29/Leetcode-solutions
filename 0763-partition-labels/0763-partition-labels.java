class Solution {
    public List<Integer> partitionLabels(String s) 
    {
        ArrayList<Integer>ans=new ArrayList<>();
        int [] lastocc=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            lastocc[x-'a']=i;
        }
        int start=0,end=0;
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            end=Math.max(lastocc[x-'a'],end);
            if(i==end) 
            {
                ans.add(end-start+1);
                start=end+1;
            } 
        }
        return ans;
    }
}
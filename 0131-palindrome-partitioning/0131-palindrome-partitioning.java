class Solution {
    List<List<String>> ans= new ArrayList<>();

    public List<List<String>> partition(String s) 
    {
        List<String>temp= new ArrayList<>();
        helper(s,0,temp);
        return ans;
    }

    public void helper(String s, int st,List<String>temp){
        if(st==s.length())
        {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int end=st;end<s.length();end++)
        {
            if(ispalindrome(s,st,end)){
                temp.add(s.substring(st,end+1));
                helper(s,end+1,temp);
                temp.remove(temp.size()-1);
            }
        }
    }

    public boolean ispalindrome(String s,int st,int end){
        while(st<=end){
           if(s.charAt(st)!=s.charAt(end)) return false;
           st++;
           end--; 
        }

        return true;
    }
}
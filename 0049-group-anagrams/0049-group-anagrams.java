class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs)
        {
            char a[]=s.toCharArray();
            Arrays.sort(a);
            String st=new String(a);
            if(!hm.containsKey(st)) 
               hm.put(st,new ArrayList<>());
            hm.get(st).add(s);
        }

        return new ArrayList<>(hm.values());
    }
}
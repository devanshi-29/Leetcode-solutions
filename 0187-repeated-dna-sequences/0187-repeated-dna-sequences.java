class Solution {
    public List<String> findRepeatedDnaSequences(String s) 
    {
        if(s.length() < 10)
           return new ArrayList<>();

        StringBuilder sb=new StringBuilder();
        HashSet<String>hs=new HashSet<>();
        int high=9;
        for(int i=0;i<=high;i++){
         sb.append(s.charAt(i));
       }
       hs.add(sb.toString());
       HashSet<String>repeated=new HashSet<>();
       while(high<s.length()){
         sb.deleteCharAt(0);
         high++;
        if(high<s.length()) sb.append(s.charAt(high));
         String str =sb.toString();
         if(hs.contains(str)) 
            repeated.add(str);
         else
            hs.add(str);         
       }

       return new ArrayList<>(repeated);
    }
}
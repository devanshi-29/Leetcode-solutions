class Solution {
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        ArrayList<String>ans=new ArrayList<>();
        HashMap<String,Integer>hm=new HashMap<>();
        String temp1[]=s1.split(" ");
        String temp2[]=s2.split(" ");
        for(String word:temp1){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        for(String word:temp2){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        
        for(String key:hm.keySet()){
            if(hm.get(key)==1){
                ans.add(key);
            }
        }

        return ans.toArray(new String[0]);
    }
}
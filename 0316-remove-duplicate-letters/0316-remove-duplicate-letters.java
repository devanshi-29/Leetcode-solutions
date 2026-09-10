class Solution {
    
    public String removeDuplicateLetters(String s) 
    {
        Stack <Character> st=new Stack<>();
        Set<Character> seen = new HashSet<>();

        Map<Character, Integer> lastOcc = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastOcc.put(s.charAt(i), i);
        }
        
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(!seen.contains(curr)){
                while(!st.isEmpty() && st.peek()>curr && i< lastOcc.get(st.peek())){
                seen.remove(st.pop());
              }
               seen.add(curr);
               st.push(curr);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
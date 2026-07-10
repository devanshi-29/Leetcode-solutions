class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
       HashSet<Integer>n1=new HashSet<>();
       HashSet<Integer>n2=new HashSet<>(); 
       List<List<Integer>> answer=new ArrayList<>();
       answer.add(new ArrayList<>());
       answer.add(new ArrayList<>());
       for(int x:nums1)
       {
         n1.add(x);
       }

       for(int x:nums2)
       {
         n2.add(x);
       }

       for(int key:n1)
       {
         if(!n2.contains(key)) 
            answer.get(0).add(key);
       }

       for(int key:n2)
       {
         if(!n1.contains(key)) 
            answer.get(1).add(key);
       }

       return answer;
    }
}
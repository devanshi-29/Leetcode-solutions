class Solution {
    public List<Boolean> kidsWithCandies(int[] can, int extraCandies) {
        int max=0;
        for(int x:can){
            max=Math.max(max,x);
        }
         
        ArrayList<Boolean>res=new ArrayList<>();
        for(int i=0;i<can.length;i++){
           if(max<=can[i]+extraCandies)
             res.add(true);
           else 
             res.add(false);
        }

        return res;
    }
}
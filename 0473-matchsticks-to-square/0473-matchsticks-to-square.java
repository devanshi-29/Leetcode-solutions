class Solution {
    public boolean bt(int []ms,int[] sides,int idx,int target){
        if(idx==ms.length){
            return (sides[0]==target && sides[1]==target && sides[2]==target && sides[3]==target);
        }

        int stick=ms[idx];

        for(int i=0;i<4;i++){
            if(sides[i]+stick <=target){
                
                // choose
                sides[i] += stick;

                // explore
                if (bt(ms, sides, idx + 1, target)) {
                    return true;
                }

                // undo / backtrack
                sides[i] -= stick;

                // avoid duplicate states
                if (sides[i] == 0) {
                    break;
                }

            }
        }

        return false;
    }
    public boolean makesquare(int[] ms) 
    {
         int sum = 0;

         for (int x : ms) {
            sum += x;
          }

         if(sum % 4 !=0) return false;
         int target=sum/4;

        // Largest sticks first --descending order
        Arrays.sort(ms);

        for (int i = 0, j = ms.length - 1; i < j; i++, j--) {
            int temp = ms[i];
            ms[i] = ms[j];
            ms[j] = temp;
        }

        int[] sides=new int[4];

        return bt(ms,sides,0,target);
    }
}
class Solution {
    public int carFleet(int target, int[] pos, int[] speed) 
    {
        HashMap<Integer,Double>hm=new HashMap<>();
        for(int i=0;i<pos.length;i++){
            double time=(double)(target-pos[i])/speed[i];
            hm.put(pos[i],time);
        }

        Arrays.sort(pos);
        int fleet=0;
        double lasttime=0;
        for(int i=pos.length-1;i>=0;i--){
            if(lasttime < hm.get(pos[i])){
                fleet++;
                lasttime=hm.get(pos[i]);
            }
        }

        return fleet;
    }
}
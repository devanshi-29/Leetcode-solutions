class FindSumPairs {

    int[] n1,n2;
    HashMap<Integer,Integer>hm=new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        n1=nums1;
        n2=nums2;
        for(int x:n2)
        {
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
    }
    
    public void add(int index, int val) {
        // reduce freq of old element
        int old=n2[index];
        hm.put(old,hm.get(old)-1);
        if(hm.get(old)==0)
          hm.remove(old);

        n2[index]+=val;

        //update new value in hm
        int recent=n2[index];
        hm.put(recent,hm.getOrDefault(recent,0)+1);
        
    }
    
    public int count(int tot) {
        int c=0;
        for(int i=0;i<n1.length;i++)
        {
            int need=tot-n1[i];
            if(hm.containsKey(need)) c+=hm.getOrDefault(need, 0);
        }
        return c;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
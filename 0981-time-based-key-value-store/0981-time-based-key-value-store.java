class data{
    String val;
    int time;

    data(String val,int time){
        this.val=val;
        this.time=time;
    }
}

class TimeMap {
    HashMap<String,List<data>> hm;

    public TimeMap() {
        hm=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        hm.putIfAbsent(key,new ArrayList<>());
        hm.get(key).add(new data(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!hm.containsKey(key)) return "";
        List<data> list=hm.get(key);
        int l=0,h=list.size()-1;
        String ans="";
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(list.get(mid).time <= timestamp)
            {
                ans=list.get(mid).val;
                l=mid+1;
            }
            else 
               h=mid-1;
        } 

        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
class Solution {
    public boolean isPathCrossing(String path) 
    {
       HashSet<String>hs=new HashSet<>();
       int x=0,y=0;
       hs.add("0,0");
       for(int i=0;i<path.length();i++)
       {
        char ch=path.charAt(i);
         if(ch =='N') y+=1;
         else if(ch == 'W')x-=1;
         else if(ch == 'E') x+=1;
         else if(ch == 'S')y-=1;
         String temp= x + "," + y;
        if(hs.contains(temp)) return true;
        hs.add(temp);
         
       }

       return false;
    }
}
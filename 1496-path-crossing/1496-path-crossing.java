class Solution {
    public boolean isPathCrossing(String path) 
    {
       HashSet<String>hs=new HashSet<>();
       int x=0,y=0;
       hs.add("0,0");
       for(int i=0;i<path.length();i++)
       {
        char ch=path.charAt(i);
         if(ch =='N') y++;
         else if(ch == 'W')x--;
         else if(ch == 'E') x++;
         else if(ch == 'S')y--;
        if(hs.contains(x + "," + y)) return true;
        else hs.add(x + "," + y);  
       }

       return false;
    }
}
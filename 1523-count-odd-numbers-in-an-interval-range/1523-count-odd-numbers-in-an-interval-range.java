class Solution {
    public int countOdds(int low, int high) {
        int totnums=high-low+1;  
 
		if(low%2!=0 && high%2!=0)  
            return totnums/2 + 1;
        
		return totnums/2;
    }
}
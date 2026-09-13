class Solution {
    public String restoreString(String s, int[] indices) {
        int n=indices.length;
        char [] arr =new char[n];
        for(int i=0;i<n;i++){
            int x=indices[i];
            arr[x]=s.charAt(i);
        }

        return new String(arr);
    }
}
class Solution {
    public int search(int[] a, int target) 
    {
        int n=a.length;
        int st=0,end=n-1,mid;
        while(st<=end)
        {
           mid=st+(end-st)/2;

           if (a[mid] == target) {
                return mid;
            }
            
            if(a[st]<=a[mid])
            {
                if(target<a[mid] && target>=a[st]) 
                end=mid-1;
                else
                st=mid+1;
            }
            else 
            {
                if(target>a[mid] && target<=a[end])
                st=mid+1;
                else end=mid-1;
            }

        }

        return -1;
    }
}
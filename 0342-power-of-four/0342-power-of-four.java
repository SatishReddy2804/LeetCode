class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        int low=0;
        int high=15;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long pow=(long)Math.pow(4,mid);
            if(pow==n)
            {
                return true;
            }
            else if(pow<n)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;  
    }
}
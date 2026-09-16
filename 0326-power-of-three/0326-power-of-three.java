class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        int low=0;
        int high=19;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long pow=(long)Math.pow(3,mid);
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
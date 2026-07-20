class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isinc=true;
        boolean isdec=true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                isinc=false;
            }
             if(nums[i]<nums[i+1])
            {
                isdec=false;
            }
        }
        if((isinc) || (isdec))
        {
            return true;
        }
        return false;
    }
}
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=1;
        int mc=1;
        for(int r=1;r<nums.length;r++)
        {
            if(nums[r]>nums[r-1])
            {
                c++;
            }
            else
            {
                c=1;
            }
            mc=Math.max(mc,c);
        }
        return mc;
    }
}
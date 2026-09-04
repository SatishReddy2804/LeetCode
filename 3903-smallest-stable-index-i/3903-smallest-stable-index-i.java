class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
            min=Integer.MAX_VALUE;
            for(int j=nums.length-1;j>=i;j--)
            {
                min=Math.min(min,nums[j]);
            }
            if(max-min<=k) return i;
        }
        return -1;
    }
}
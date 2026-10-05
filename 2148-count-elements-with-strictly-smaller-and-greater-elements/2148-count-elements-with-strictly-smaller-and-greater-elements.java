class Solution {
    public int countElements(int[] nums) {
        int count=0;
        int min=nums[0];
        int max=nums[0];
        for(int i:nums)
        {
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        for(int i:nums)
        {
            if(i>min && i<max)
            {
                count++;
            }
        }
        return count;
    }
}
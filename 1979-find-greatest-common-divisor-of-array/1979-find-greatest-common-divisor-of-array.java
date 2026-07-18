class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int val=nums[i];
            if(val<min)
            {
                min=val;
            }
            if(max<=val)
            {
                max=val;
            }
        }
        while(min!=0)
        {
            int temp=min;
            min=max%min;
            max=temp;
        }
        return max;
    }
}
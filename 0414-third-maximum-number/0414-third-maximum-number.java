class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=nums[n-1];
        int c=1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]!=nums[i+1])
            {
                max=nums[i];
                c++;
            }
            if(c==3)
            {
                break;
            }
        }
        return c<3?nums[n-1]:max;
    }
}
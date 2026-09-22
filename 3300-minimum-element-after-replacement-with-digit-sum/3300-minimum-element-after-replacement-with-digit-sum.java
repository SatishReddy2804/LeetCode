class Solution {
    public int digitSum(int n)
    {
        int temp=n;
        int sum=0;
        while(temp>0)
        {
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int a=digitSum(nums[i]);
            nums[i]=a;
            min=Math.min(min,nums[i]);
        }
        return min;
    }
}
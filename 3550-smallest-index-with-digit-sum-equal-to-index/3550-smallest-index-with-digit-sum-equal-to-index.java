class Solution {
    public int sumOfDigits(int n)
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
    public int smallestIndex(int[] nums) {
        int index=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(sumOfDigits(nums[i])==i)
            {
                index=i;
                break;
            }
        }
        return index;
    }
}
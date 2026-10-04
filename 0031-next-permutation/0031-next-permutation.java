class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind==-1)
        {
            for(int i=0;i<nums.length/2;i++)
            {
                int temp=nums[i];
                nums[i]=nums[nums.length-i-1];
                nums[nums.length-i-1]=temp;
            }
            for(int i=0;i<nums.length;i++)
            {
                System.out.println(nums[i]+",");
                return;
            }
        }
        for(int i=nums.length-1;i>ind;i--)
        {
            if(nums[i]>nums[ind])
            {
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        Arrays.sort(nums,ind+1,nums.length);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]+",");
        }
    }
}
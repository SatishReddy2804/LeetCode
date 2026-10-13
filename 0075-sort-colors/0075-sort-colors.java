class Solution {
    public void swap(int nums[],int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int h=nums.length-1;
        int m=0;
        int l=0;
        while(m<=h)
        {
            if(nums[m]==2)
            {
                swap(nums,m,h);
                h--;
            }
            else if(nums[m]==1)
            {
                m++;
            }
            else
            {
                swap(nums,l,m);
                l++;
                m++;
            }
        }
    }
}
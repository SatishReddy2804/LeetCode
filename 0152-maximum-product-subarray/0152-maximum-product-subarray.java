class Solution {
    public int maxProduct(int[] nums) {
        long prefix=1;
        long suffix=1;
        long max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(suffix==0) suffix=1;
            if(prefix==0) prefix=1;
            prefix*=nums[i];
            suffix*=nums[nums.length-i-1];
            max=Math.max(max,Math.max(prefix,suffix));        }
        return (int)max;
    }
}
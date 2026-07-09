class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long concat=0;
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            if(i==j)
            {
                concat+=nums[i];
            }
            else
            {
                String a=String.valueOf(nums[i]);
                String b=String.valueOf(nums[j]);
                concat+=Long.parseLong(a+b);
            }
            i++;
            j--;
        }
        return concat;
    }
}
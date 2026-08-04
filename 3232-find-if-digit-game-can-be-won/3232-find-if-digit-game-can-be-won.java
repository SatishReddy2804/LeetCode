class Solution {
    public boolean canAliceWin(int[] nums) {
        int singledigitsum=0;
        int doubledigitsum=0;
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]>9)   
             {
                  doubledigitsum+=nums[i];
             }
             else
             {
                 singledigitsum+=nums[i];
             }
        }
        return singledigitsum != doubledigitsum;
    }
}
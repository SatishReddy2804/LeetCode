class Solution {
    public int[] sortedSquares(int[] nums) {
      int sq=0;
      for(int i=0;i<nums.length;i++)
      {
        int val=nums[i];
        sq=val*val;
        nums[i]=sq;
      }  
       Arrays.sort(nums);
       return nums;
    }
}
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums[nums.length/2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        return hm.get(n)<=1;
    }
}
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int l=0;
        int len=0;
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            while(hm.get(nums[i])>k)
            {
                hm.put(nums[l],hm.get(nums[l])-1);
                l++;
            }
            len=Math.max(len,i-l+1);
        }
        return len;
    }
}
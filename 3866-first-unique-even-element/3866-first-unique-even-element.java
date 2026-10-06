class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0 && hm.get(nums[i])==1)
            {
                return nums[i];
            }
        }
        return -1;
    }
}
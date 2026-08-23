class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        Arrays.sort(nums);
        for(int i:nums)
        {
            hs.add(i);
        }
        for(int i=nums[0];i<=nums[nums.length-1];i++)
        {
            if(!hs.contains(i))
            {
                li.add(i);
            }
        }
        return li;
    }
}
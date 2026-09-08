class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int longest=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int x:nums)
        {
            hs.add(x);
        }
        for(int i:hs)
        {
            if(!hs.contains(i-1))
            {
                int curr=i;
                int c=1;
                while(hs.contains(curr+1))
                {
                    curr++;
                    c++;
                }
                longest=Math.max(longest,c);
            }
        }
        return longest;
    }
}
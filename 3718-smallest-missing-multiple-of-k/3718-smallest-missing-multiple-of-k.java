class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums)
        {
            hs.add(i);
        }
        for(int i=1;i<=100;i++)
        {
            int x=i;
            x*=k;
            if(!hs.contains(x))
            {
                return x;
            }
        }
        return 101;
    }
}
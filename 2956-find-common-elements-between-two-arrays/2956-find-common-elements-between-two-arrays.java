class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int i:nums1)
        {
            hs.add(i);
        }
        for(int i:nums2)
        {
            hs2.add(i);
        }
        int answer1=0;
        int answer2=0;
        for(int i:nums1)
        {
            if(hs2.contains(i))
            {
                answer1++;
            }
        }
        for(int i:nums2)
        {
            if(hs.contains(i))
            {
                answer2++;
            }
        }
        return new int[]{answer1,answer2};
    }
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashMap<Integer,Integer> hm1=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        List<Integer> li=new ArrayList<>();
        for (int i=0;i<nums2.length;i++) {
            if(hm.containsKey(nums2[i]) && hm.get(nums2[i])>0) {
                li.add(nums2[i]);
                hm.put(nums2[i],hm.get(nums2[i])-1); 
            }
        }
        int arr[]=new int[li.size()];
        for(int i=0;i<li.size();i++)
        {
            arr[i]=li.get(i);
        }
        return arr;
    }
}
class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       int c=0;
       for(int i:nums)
       {
            hm.put(i,hm.getOrDefault(i,0)+1);
            c=Math.max(hm.get(i),c);
       } 
       int nc=0;
       for(int i:nums)
       {
            if(hm.get(i)==c)
            {
                nc++;
            }
       }
       return nc;
    }
}
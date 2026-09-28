class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums)
        {
            if(i%2==0)
            {
                hm.put(i,hm.getOrDefault(i,0)+1);
            }
        }
        if(hm.size()==0) return -1;
        int max=0;
        int ele=Integer.MAX_VALUE;
        for(int i:hm.keySet())
        {
            if(hm.get(i)>max || (hm.get(i)==max&&i<ele))
            {
                max=hm.get(i);
                ele=i;
            }
        }
        return ele;
    }
}
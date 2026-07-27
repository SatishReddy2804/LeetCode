class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int b[]=arr.clone();
        Arrays.sort(b);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int rank=1;
        for(int num:b) 
        {
            if(!hm.containsKey(num)) 
            {
                hm.put(num,rank++);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=hm.get(arr[i]);
        }
        return arr;
    }
}
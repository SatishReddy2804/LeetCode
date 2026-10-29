class Solution {
    public List<List<Integer>> rec(int i,int n,int []nums,List<List<Integer>> li,List<Integer> temp)
    {
        if(i==n)
        {
            li.add(new ArrayList<>(temp));
            return li;
        }
        temp.add(nums[i]);
        rec(i+1,n,nums,li,temp);
        temp.remove(temp.size()-1);
        rec(i+1,n,nums,li,temp);
        return li;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        int n=nums.length;
        return rec(0,n,nums,li,new ArrayList<>());
    }
}
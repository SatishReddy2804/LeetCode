class Solution {
    public void rec(int i,int[] candidates, int target,List<Integer> temp,List<List<Integer>> li,int sum)
    {
        if(sum==target)
        {
            li.add(new ArrayList<>(temp));
            return;
        }
        if(i>=candidates.length || sum>target)
        {
            return;
        }
        temp.add(candidates[i]);
        rec(i,candidates,target,temp,li,sum+candidates[i]);
        temp.remove(temp.size()-1);
        rec(i+1,candidates,target,temp,li,sum);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li=new ArrayList<>();
        rec(0,candidates,target,new ArrayList<>(),li,0);
        return li;
    }
}
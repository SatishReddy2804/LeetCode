class Solution {
    public void rec(int i,int[] candidates, int target,List<Integer> temp,List<List<Integer>> li) {
        if(target==0)
        {
            li.add(new ArrayList<>(temp));
            return;
        }
        for(int j=i;j<candidates.length;j++)
        {
            if(j>i && candidates[j]==candidates[j-1])
            {
                continue;
            }
            if(candidates[j]>target)
            {
                break;
            }
            temp.add(candidates[j]);
            rec(j+1,candidates,target-candidates[j],temp,li);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> li=new ArrayList<>();
        Arrays.sort(candidates);
        rec(0,candidates,target,new ArrayList<>(),li);
        return li;
    }
}
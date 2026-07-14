class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st=new Stack<>();
        List<Long> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            long num=nums[i];
            while(!st.isEmpty() && st.peek()==num)
            {
                num+=st.pop();
            }
            st.push(num);
        }
        for(long i:st)
        {
            li.add(i);
        }
        return li;
    }
}
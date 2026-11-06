class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int n=nums.length;
        System.out.println(n);
        for(int i=0;i<n;i++)
        {
            System.out.println(i);
            if(n%(i+1)==0)
            {
                int res=nums[i]*nums[i];
                sum+=res;
            }
        }
        return sum;
    }
}
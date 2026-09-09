class Solution {
    public int ds(int n)
    {
        int temp=n;
        int sum=0;
        while(temp>0)
        {
            int digit=temp%10;
            sum+=digit*digit;
            temp/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
        while(n!=1 && !hs.contains(n))
        {
            hs.add(n);
            n=ds(n);
        }
        return n==1;
    }
}
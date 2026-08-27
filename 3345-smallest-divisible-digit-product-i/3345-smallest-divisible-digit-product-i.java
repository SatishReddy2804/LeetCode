class Solution {
    public boolean smallt(int n,int t)
    {
        int temp=n;
        int product=1;
        while(temp>0)
        {
            int digit=temp%10;
            product*=digit;
            temp/=10;
        }
        int sn=product%t;
        return (sn==0)?true:false;
    }
    public int smallestNumber(int n, int t) {
        while(true)
        {
            System.out.println(n);
            if(smallt(n,t))
            {
                return n;
            }
            else
            {
                n++;
            }
        }
    }
}
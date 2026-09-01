class Solution {
    public long sumAndMultiply(int n) {
        StringBuffer sb=new StringBuffer();
        long temp=n;
        while(temp>0)
        {
            long digit=temp%10;
            if(digit!=0)
            {
                sb.append(digit);
            }
            temp/=10;
        }
        if(sb.length()==0) return 0;
        long x=Long.parseLong(sb.reverse().toString());
        long sum=0;
        long y=x;
        while(x>0)
        {
            long digit=x%10;
            sum+=digit;
            x/=10;
        }
        return y*sum;
    }
}
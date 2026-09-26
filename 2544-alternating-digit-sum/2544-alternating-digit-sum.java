class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++)
        {
            int digit=s.charAt(i)-'0';
            if(i%2==1)
            {
                sum-=digit;
            }
            else
            {
                sum+=digit;
            }
        }
        return sum;
    }
}
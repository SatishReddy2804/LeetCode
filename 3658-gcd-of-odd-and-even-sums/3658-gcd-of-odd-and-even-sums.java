class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=1;
        int sumEven=2;
        int x=1,y=2;
        for(int i=1;i<n;i++)
        {
            sumOdd+=2;
            x+=sumOdd;
            sumEven+=2;
            y+=sumEven;
        }
        int a=Math.abs(x);
        int b=Math.abs(y);
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
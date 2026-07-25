class Solution {
    public int maxProduct(int n) {
        int largestdigit=0;
        int secondlargestdigit=0;
        while(n>0)
        {
            int digit=n%10;
            if(digit>largestdigit)
            {
                secondlargestdigit=largestdigit;
                largestdigit=digit;
            }
            else if(digit>secondlargestdigit)
            {
                secondlargestdigit=digit;
            }
            n/=10;
        }
        return largestdigit*secondlargestdigit;
    }
}
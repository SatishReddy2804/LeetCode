class Solution {
    public int mirrorDistance(int n) {
        String res="";
        int temp=n;
        while(temp>0)
        {
            res+=temp%10;
            temp/=10;

        }
        return Math.abs(Integer.valueOf(res)-n);
    }
}
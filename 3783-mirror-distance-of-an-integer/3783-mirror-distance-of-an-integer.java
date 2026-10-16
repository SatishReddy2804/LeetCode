class Solution {
    public int mirrorDistance(int n) {
        String res=String.valueOf(n);
        StringBuilder s=new StringBuilder(res);
        String ans=s.reverse().toString();
        int rev=Integer.parseInt(ans);
        return Math.abs(rev-n);
    }
}
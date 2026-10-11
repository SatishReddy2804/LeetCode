class Solution {
    public boolean judgeCircle(String moves) {
        int t=0;
        int s=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
            {
                t++;
            }
            if(moves.charAt(i)=='D')
            {
                t--;
            }
            if(moves.charAt(i)=='R')
            {
                s++;
            }
            if(moves.charAt(i)=='L')
            {
                s--;
            }
        }
        return (t==0 && s==0);
    }
}
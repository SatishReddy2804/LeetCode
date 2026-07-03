class Solution {
    public boolean isPossible(int n, int[] quantities,int m)
    {
        for(int i=0;i<quantities.length;i++)
        {
            int val=quantities[i]/m;
            if(quantities[i]%m!=0)
            {
                val++;
            }
            n-=val;
            if(n<0)
            {
                return false;
            }
        }
        return true;
    } 
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
        int r=(int)Math.pow(10,5);
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(isPossible(n,quantities,m))
            {
                r=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return l;
    }
}
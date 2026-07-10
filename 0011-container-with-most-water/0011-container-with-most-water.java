class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int Max=0;
        int j=height.length-1;
        while(i<j)
        {
            int h=Math.min(height[i],height[j]);
            int w=j-i;
            int area=h*w;
            Max=Math.max(Max,area);
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return Max;
    }
}
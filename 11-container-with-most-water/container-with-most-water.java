class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int w=j-i;
            int a=h*w;
            max=Math.max(max,a);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return max;
    }
}
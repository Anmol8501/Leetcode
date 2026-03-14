// Last updated: 3/14/2026, 4:34:16 PM
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;
        int leftMax = 0;
        int rightMax = 0;
        int l = 0;
        int r = n-1;
        while(l<=r) {
            if(height[l]<height[r]) {
                leftMax = Math.max(leftMax,height[l]);
                water+=leftMax-height[l];
                l++;
            } else {
                rightMax = Math.max(rightMax,height[r]);
                water+=rightMax-height[r];
                r--;
            }
        }
        return water;
    }
}
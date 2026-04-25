// Last updated: 4/25/2026, 3:10:25 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int i=0;
4        int j=height.length-1;
5        int max=0;
6        while(i<j){
7            max=Math.max(Math.min(height[i],height[j])*(j-i),max);
8            if(height[i]>=height[j])j--;
9            else i++;
10        }
11        return max;
12    }
13}
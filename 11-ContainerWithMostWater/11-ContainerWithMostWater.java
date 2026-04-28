// Last updated: 4/28/2026, 8:03:51 PM
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            int localMax = Math.min(height[i],height[j])*(j-i);
            if(max<localMax) max=localMax;
            if(height[i]>=height[j]){
                int k=j-1;
                while(height[k]<=height[j] && k>i){k--;}
                j=k;
            }
            else{
                int k=i+1;
                while(height[k]<=height[i] && k<j){k++;}
                i=k;
            }
        }
        return max;
    }
}
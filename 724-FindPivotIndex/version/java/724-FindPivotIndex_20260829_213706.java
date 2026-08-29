// Last updated: 8/29/2026, 9:37:06 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int n=nums.length;
4        for(int i=0;i<n;i++){
5            int lsum=0,rsum=0;
6
7            for(int j=0;j<i;j++){
8                lsum+=nums[j];
9            }
10            for(int j=i+1;j<n;j++){
11                rsum+=nums[j];
12            }
13            if(rsum==lsum) return i;
14        }
15        return -1;     
16    }
17}
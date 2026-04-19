// Last updated: 4/19/2026, 12:58:11 PM
1class Solution {
2    public int maxDistance(int[] nums1, int[] nums2) {
3        int n=nums1.length;
4        int m=nums2.length;
5        int i,j;
6        for(i=0,j=0;i<n && j<m;j++){
7            if(nums1[i]>nums2[j]) i++;
8        }
9        
10        return Math.max(0,j-1-i);
11    }
12}
// Last updated: 4/19/2026, 12:59:48 PM
1class Solution {
2    public int maxDistance(int[] nums1, int[] nums2) {
3
4        int i,j;
5        for(i=0, j=0; i<nums1.length && j<nums2.length; j++){
6            
7            if(nums1[i]>nums2[j]) i++;
8        }
9        
10        return Math.max(0,j-1-i);
11    }
12}
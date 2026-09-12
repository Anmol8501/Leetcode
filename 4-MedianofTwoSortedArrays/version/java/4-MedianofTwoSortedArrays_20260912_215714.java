// Last updated: 9/12/2026, 9:57:14 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n=nums1.length;
4        int m=nums2.length;
5        int[] merged=new int[m+n];
6        for(int i=0;i<n;i++){
7            merged[i]=nums1[i];
8        }
9        for(int i=n;i<m+n;i++){
10            merged[i]=nums2[i-n];
11        }
12        Arrays.sort(merged);
13        if((m+n)%2!=0) return merged[((m+n))/2];
14        return (float)(merged[(m+n)/2]+merged[((m+n-1))/2])/2;
15    }
16}
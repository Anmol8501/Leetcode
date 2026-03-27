// Last updated: 3/27/2026, 3:45:56 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n=nums.length;
4        int shift=k%n;
5        int[] arr=new int[n];
6        for(int i=0;i<n;i++){
7            int newcol=(i+shift)%n;
8            arr[newcol]=nums[i];
9        }
10        for(int i=0;i<n;i++){
11        nums[i]=arr[i];
12    }}
13}
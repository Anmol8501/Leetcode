// Last updated: 10/28/2026, 10:46:32 AM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n=nums.length;
4        int shift=k%n;
5        int[] arr=new int[n];
6
7        for (int i = 0; i < shift; i++) {
8        arr[i] = nums[n - shift + i];
9        }
10
11        for (int i = shift; i < n; i++) {
12        arr[i] = nums[i - shift];
13        }
14        for(int i = 0; i < n; i++)
15            nums[i] = arr[i];
16    }
17}
// Last updated: 10/18/2026, 8:30:23 AM
1class Solution {
2    public int minDeletions(int[] nums) {
3        int n = nums.length;
4        int count = 0;
5        
6        for(int i = 1; i < n; i++){
7            if(nums[i]==nums[i-1]) count++;
8        }
9        return count;
10    }
11}
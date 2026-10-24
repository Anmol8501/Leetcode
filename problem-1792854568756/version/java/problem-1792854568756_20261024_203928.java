// Last updated: 10/24/2026, 8:39:28 PM
1class Solution {
2    public int peakValleyDifference(int[] nums) {
3        int n = nums.length;
4        int peak = 0, valley = 0;
5        
6        for(int i = 1; i < n-1; i++){
7            if(nums[i] < nums[i-1] && nums[i] < nums[i+1]){
8                valley += nums[i];
9            }
10            else if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
11                peak += nums[i];
12            }
13        }
14        return peak - valley;
15    }
16}
// Last updated: 3/12/2026, 8:03:00 PM
1class Solution {
2    public int rob(int[] nums) {
3        int prev1=0;
4        int prev2=0;
5        for(int i=0;i<nums.length;i++){
6            int curr=Math.max(prev1,(prev2+nums[i]));
7            prev2=prev1;
8            prev1=curr;
9        }
10        return prev1;
11    }
12}
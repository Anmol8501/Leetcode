// Last updated: 8/8/2026, 5:24:08 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxJump=0;
4        for(int i=0;i<nums.length;i++){
5            if(maxJump>=nums.length) return true;
6            if (i>maxJump) return false;
7            maxJump=Math.max(maxJump,(i+nums[i]));
8        }
9        return true;
10    }
11}
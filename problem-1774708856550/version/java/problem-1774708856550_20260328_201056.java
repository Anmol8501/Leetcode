// Last updated: 3/28/2026, 8:10:56 PM
1class Solution {
2    public int minAbsoluteDifference(int[] nums) {
3        int lastOneIndex = -1;
4        int lastTwoIndex = -1;
5        int minDiff = Integer.MAX_VALUE;
6
7        for (int i = 0; i < nums.length; i++) {
8            if (nums[i] == 1) {
9                lastOneIndex = i;
10                if (lastTwoIndex != -1) {
11                    minDiff = Math.min(minDiff, i - lastTwoIndex);
12                }
13            } else if (nums[i] == 2) {
14                lastTwoIndex = i;
15                if (lastOneIndex != -1) {
16                    minDiff = Math.min(minDiff, i - lastOneIndex);
17                }
18            }
19        }
20
21        return minDiff == Integer.MAX_VALUE ? -1 : minDiff;
22    }
23}
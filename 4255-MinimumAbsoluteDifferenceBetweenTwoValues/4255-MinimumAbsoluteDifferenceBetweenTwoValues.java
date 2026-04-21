// Last updated: 4/21/2026, 2:24:07 PM
class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int lastOneIndex = -1;
        int lastTwoIndex = -1;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                lastOneIndex = i;
                if (lastTwoIndex != -1) {
                    minDiff = Math.min(minDiff, i - lastTwoIndex);
                }
            } else if (nums[i] == 2) {
                lastTwoIndex = i;
                if (lastOneIndex != -1) {
                    minDiff = Math.min(minDiff, i - lastOneIndex);
                }
            }
        }

        return minDiff == Integer.MAX_VALUE ? -1 : minDiff;
    }
}
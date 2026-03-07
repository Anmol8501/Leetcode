// Last updated: 3/7/2026, 10:10:09 PM
class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;

        long[] suffixMin = new long[n];
        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        long prefixSum = 0;
        long ans = Long.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            prefixSum += nums[i];
            ans = Math.max(ans, prefixSum - suffixMin[i + 1]);
        }

        return ans;
    }
}

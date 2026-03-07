// Last updated: 3/7/2026, 10:10:29 PM
class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int i = 0, j = 1;
        int maxLen = 1;

        while (i <= j && j < n) {
            if (nums[j] <= (long)k * nums[i]) {
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            } else {
                i++;
            }
        }

        return n - maxLen;
    }
}

// Last updated: 9/10/2026, 11:05:48 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int left = 0;
        int windowSum = 0;

        // Build the first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int right = k; right < nums.length; right++) {

            windowSum += nums[right];
            windowSum -= nums[left];

            left++;

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}
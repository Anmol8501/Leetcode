// Last updated: 3/7/2026, 10:11:02 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int sum = 0;
        for (int freq : arr) {
            if (freq == max) {
                sum += freq;
            }
        }

        return sum;
    }
}

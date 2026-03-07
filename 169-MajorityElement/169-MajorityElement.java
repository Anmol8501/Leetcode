// Last updated: 3/7/2026, 10:13:46 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length/2]);
    }
}
// Last updated: 3/7/2026, 10:14:12 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
             if(nums[i]>=target)
                 return i; }
        return nums.length;
    }
}
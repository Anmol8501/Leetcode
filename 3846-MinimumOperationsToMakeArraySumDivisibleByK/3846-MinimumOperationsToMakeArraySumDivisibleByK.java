// Last updated: 3/7/2026, 10:10:35 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return sum%k;
    }
}
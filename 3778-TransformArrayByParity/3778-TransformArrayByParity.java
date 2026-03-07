// Last updated: 3/7/2026, 10:10:37 PM
class Solution {
    public int[] transformArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) nums[i]=0;
            else nums[i]=1;
        }
        Arrays.sort(nums);
        return nums;
    }
}
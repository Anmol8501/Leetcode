// Last updated: 3/7/2026, 10:17:53 PM
class Solution {
    public int maximumDifference(int[] nums) {
        int a=nums[0];
        int diff=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<a) a=nums[i];
            else if(nums[i]-a>diff+1) diff=nums[i]-a;
        }
        return diff;
    }
}
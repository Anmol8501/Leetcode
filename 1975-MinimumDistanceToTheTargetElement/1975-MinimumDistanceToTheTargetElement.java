// Last updated: 4/21/2026, 2:25:12 PM
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans=1000;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans=Math.min(Math.abs(start-i),ans);
            }
        }
        return ans;
    }
}
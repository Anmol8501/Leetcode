// Last updated: 3/7/2026, 10:18:11 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
           ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
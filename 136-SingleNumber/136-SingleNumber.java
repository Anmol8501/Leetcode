// Last updated: 3/7/2026, 10:13:51 PM
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i:nums){
            ans=ans^i;
        }
        return ans;
    }
}
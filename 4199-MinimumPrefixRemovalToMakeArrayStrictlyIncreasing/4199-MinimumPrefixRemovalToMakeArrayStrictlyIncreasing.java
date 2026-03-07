// Last updated: 3/7/2026, 10:10:12 PM
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int b=nums[0];
        int a=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=b){
                a=i;
            }
            b=nums[i];
        }
        return a;
    }
}
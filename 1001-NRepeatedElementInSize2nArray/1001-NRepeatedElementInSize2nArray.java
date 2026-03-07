// Last updated: 3/7/2026, 10:12:32 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n/2+2;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return nums[j];
                }
            }
        }
        return 2;
    }
}
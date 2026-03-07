// Last updated: 3/7/2026, 10:10:21 PM
class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0;
        int a=1;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i]*a;
            a*=-1;
        }
        return sum;
    }
}
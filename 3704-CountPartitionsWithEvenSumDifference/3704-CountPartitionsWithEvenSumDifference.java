// Last updated: 3/7/2026, 10:10:41 PM
class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        int j=0;
        for(int i:nums)sum+=i;
        for(int i=0;i<nums.length-1;i++){
            sum=sum-2*nums[i];
            if(sum%2==0)j++;
        }
        return j;
    }
}
// Last updated: 3/7/2026, 10:12:51 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double maxSum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum=sum;
        for(int i=k;i<nums.length;i++){
            maxSum=Math.max(sum,maxSum);
            sum=sum+nums[i]-nums[i-k];
        }
        if(sum>maxSum) return sum/k;
        return maxSum/k;
    }
}
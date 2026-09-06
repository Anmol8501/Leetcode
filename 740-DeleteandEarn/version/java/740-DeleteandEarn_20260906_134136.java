// Last updated: 9/6/2026, 1:41:36 PM
class Solution {
    public int deleteAndEarn(int[] nums) {
       
       int max=Integer.MIN_VALUE;

       for(int i=0;i<nums.length;i++){
        max=Math.max(nums[i],max);
       }

       int points[]=new int[max+1];

       for(int num:nums){
        points[num]+=num;
       }
       int dp[]=new int[max+1];

       Arrays.fill(dp,-1);

       return helper(dp,points,0);
    }

    int helper(int dp[],int points[],int i){
        if(i>=points.length){
            return 0;
        }

        if(dp[i]!=-1) return dp[i];

        int take=points[i]+helper(dp,points,i+2);
        int notTake=helper(dp,points,i+1);

        dp[i]=Math.max(take,notTake);
        return dp[i];
    }
}
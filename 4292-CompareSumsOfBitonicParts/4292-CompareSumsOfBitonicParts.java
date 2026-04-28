// Last updated: 4/28/2026, 7:58:30 PM
class Solution {
    public int compareBitonicSums(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int peek=0;
        for(int i=1;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                peek=i;
            }
        }
        long sum1=0,sum2=0;
        for(int i=0;i<=peek;i++) sum1+=nums[i];
        for(int i=peek;i<n;i++) sum2+=nums[i];
        if(sum1>sum2) return 0;
        if(sum1<sum2) return 1;
        return -1;
    }
}
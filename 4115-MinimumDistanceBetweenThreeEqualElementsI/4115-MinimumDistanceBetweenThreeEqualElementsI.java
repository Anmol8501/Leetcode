// Last updated: 4/21/2026, 2:24:24 PM
class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int ans=101;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]!=nums[i]) continue;
                for(int k=j+1;k<n;k++){
                    if(nums[k]==nums[i]){
                        ans = Math.min(ans, k - i);
                        break;
                    }
                }
            }
        }
        if(ans==101) return -1;
        return ans*2;
    }
}
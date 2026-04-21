// Last updated: 4/21/2026, 2:24:09 PM
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] min=new int[n];
        int m=1000000000;
        for(int i=n-1;i>=0;i--){
            if(m>nums[i]){
                min[i]=nums[i];
                m=nums[i];
            }
            else min[i]=m;
        }
        int max=nums[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            if(max-min[i]<=k) return i;
        }
        return -1;
    }
}
// Last updated: 3/7/2026, 10:12:07 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){s++;}
            }
            res[i]=s;
        }
        return res;
    }
}
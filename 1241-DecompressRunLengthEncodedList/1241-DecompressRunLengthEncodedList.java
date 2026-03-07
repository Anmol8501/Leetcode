// Last updated: 3/7/2026, 10:12:21 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int a=0;
        int sum=0;
        while(a<nums.length/2){
            sum+=nums[a*2];
            a++;
        }
        int[] ans=new int[sum];
        int i=0,j=0;
        while(i<nums.length/2){
            int k=0;
            while(k<nums[2*i]){
                ans[j]=nums[2*i+1];
                j++;
                k++;
            }
            i++;
        }
        return ans;
    }
}
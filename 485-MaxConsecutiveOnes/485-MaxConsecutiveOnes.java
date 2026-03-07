// Last updated: 3/7/2026, 10:13:00 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m =nums[0];
        int k=0;
        int[] b=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1){
                k++;
                b[i]=k;
            }
            else {
                k=0;
                b[i]=k;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(b[i]>m){
                m=b[i];
            }
        }
        return m;
    }
}
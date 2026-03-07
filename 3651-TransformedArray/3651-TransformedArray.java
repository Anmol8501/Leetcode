// Last updated: 3/7/2026, 10:10:45 PM
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                result[i]=0;
            else if(nums[i]>0){
                result[i]=nums[(i+nums[i])%nums.length];
            }
            else{
                int index=i+nums[i];
                while(index<0){
                    index+=nums.length;
                }
                result[i]=nums[index];
            }
        }
        return result;
    }
}
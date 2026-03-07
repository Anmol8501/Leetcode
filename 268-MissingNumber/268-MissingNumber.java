// Last updated: 3/7/2026, 10:13:28 PM
class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j)
            return j;
        }
        return nums.length;
    }
    void swap(int[] nums,int i,int correct){
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;
    } 
}
// Last updated: 3/7/2026, 10:13:25 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i:nums){
            if(i!=0){
                nums[index]=i;
                index++;
            }
        }
        while(index<nums.length){
            nums[index]=0;
            index++;
        }
    }
}
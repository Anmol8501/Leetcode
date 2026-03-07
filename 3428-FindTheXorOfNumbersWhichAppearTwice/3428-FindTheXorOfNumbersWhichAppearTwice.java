// Last updated: 3/7/2026, 10:10:55 PM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        boolean[] arr=new boolean[51];
        int xor=0;
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]==true) xor=xor^nums[i];
            else arr[nums[i]]=true;
        }
        return xor;
    }
}
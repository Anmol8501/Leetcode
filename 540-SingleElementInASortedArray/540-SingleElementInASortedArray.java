// Last updated: 4/28/2026, 8:02:36 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor=0;
        for(int i:nums){
            xor=xor^i;
        }
        return xor;
    }
}
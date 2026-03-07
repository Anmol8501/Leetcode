// Last updated: 3/7/2026, 10:17:45 PM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean find=true;
        while(find){
            find=false;
            for(int n:nums){
                if(original==n){
                    original*=2;
                    find=true;
                }
            }
        }
        return original;
    }
}
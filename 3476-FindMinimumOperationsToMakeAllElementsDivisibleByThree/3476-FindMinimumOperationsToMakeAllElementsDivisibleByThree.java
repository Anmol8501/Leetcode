// Last updated: 3/7/2026, 10:10:52 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int n=0;
        for(int i:nums){
            if(i%3!=0)n++;
        }
        return n;
    }
}
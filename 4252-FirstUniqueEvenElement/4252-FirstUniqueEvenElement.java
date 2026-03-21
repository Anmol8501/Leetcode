// Last updated: 3/21/2026, 8:48:50 PM
class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] count =new int[101];
        for(int n:nums){
            if(n%2==0){
                count[n]++;
            }
        }
        for(int n:nums){
            if(count[n]==1) return n;
        }
        return -1;
    }
}
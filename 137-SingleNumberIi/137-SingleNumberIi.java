// Last updated: 4/28/2026, 8:03:15 PM
class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0 , twos = 0;
        for (int i : nums) {
            ones = ( ones ^ i ) & ~twos;
            twos = ( twos ^ i ) & ~ones;
        }

        return ones;
    }
}
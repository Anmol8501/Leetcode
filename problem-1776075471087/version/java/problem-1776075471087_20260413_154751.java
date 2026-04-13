// Last updated: 4/13/2026, 3:47:51 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int ones=0,twos=0;
4        for(int i:nums){
5            ones=(ones^i) & ~twos;
6            twos=(twos^i) & ~ones;
7        }
8        return ones;
9    }
10}
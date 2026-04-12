// Last updated: 4/12/2026, 10:03:45 PM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        for(int i=0;i<nums.length;i++){
4            int j=i+1;
5            while(j-i<=k && j<nums.length){
6                if(nums[i]==nums[j]) return true;
7                j++;
8            }
9        }
10        return false;
11    }
12}
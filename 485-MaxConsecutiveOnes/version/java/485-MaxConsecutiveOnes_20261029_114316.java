// Last updated: 10/29/2026, 11:43:16 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int start = 0;
4        int end = nums.length;
5        int count = 0;
6
7        while(start < end){
8            int c = 0;
9            while(start < end && nums[start] == 1){
10                c++;
11                start++;
12            }
13            while(start < end && nums[start] == 0){
14                start++;
15            }
16            count = Math.max(count,c);
17        }
18        return count;
19    }
20}
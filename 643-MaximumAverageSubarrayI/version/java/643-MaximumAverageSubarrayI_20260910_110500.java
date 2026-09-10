// Last updated: 9/10/2026, 11:05:00 AM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int left = 0;
4        double average = 0.0;
5        double maxAv = -10000.0;
6
7        for(int i=0;i<nums.length;i++){
8            average+=nums[i];
9
10            while((i-left+1)==k){
11                maxAv = Math.max(maxAv, average/k);
12                average-=nums[left];
13                left++;
14            }
15        }
16        return maxAv;
17    }
18}
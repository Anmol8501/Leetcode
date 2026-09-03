// Last updated: 9/4/2026, 12:35:15 AM
1class Solution {
2    public int findLHS(int[] nums) {
3        Arrays.sort(nums);
4        int start = 0;
5        int maxlen = 0;
6
7        for(int i=0;i<nums.length;i++){
8            while(nums[i]-nums[start]>1){
9                start++;
10            }
11            if(nums[i]-nums[start]==1){
12                maxlen = Math.max(maxlen, i-start+1);
13            }
14        }
15        return maxlen;
16    }
17}
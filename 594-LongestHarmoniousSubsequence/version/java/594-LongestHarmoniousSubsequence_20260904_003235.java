// Last updated: 9/4/2026, 12:32:35 AM
1class Solution {
2    public int findLHS(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int maxlen = 0;
6
7        for(int i=0;i<n;i++){
8            int end = n-1;
9            while(nums[end]-nums[i]>1){
10                end--;
11            }
12            if(nums[end]-nums[i]==1){
13                maxlen = Math.max(maxlen, end-i+1);
14            }
15        }
16        return maxlen;
17    }
18}
// Last updated: 10/13/2026, 11:29:01 AM
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        int n = nums.length;
4
5        for(int i = 0; i < n; i++){
6            nums[i] = nums[i]*nums[i];
7        }
8        Arrays.sort(nums);
9        long sum = 0;
10
11        for(int i = 0; i < n/2; i++){
12            sum -= nums[i];
13        }
14        for(int i = n/2; i < n; i++){
15            sum += nums[i];
16        }
17        return sum;
18    }
19}
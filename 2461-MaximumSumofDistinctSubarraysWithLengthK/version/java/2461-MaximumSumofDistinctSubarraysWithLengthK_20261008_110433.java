// Last updated: 10/8/2026, 11:04:33 AM
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        int n = nums.length;
4        long sum = 0;
5        long max = 0;
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        for(int i = 0; i<k-1; i++){
9            sum += nums[i];
10            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
11        }
12
13        for(int i = k - 1; i < n; i++){
14            sum += nums[i];
15            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
16            
17            if(map.size() == k){
18                max = Math.max(max, sum);
19            }
20
21            int x = nums[i + 1 - k];
22            sum -= x;
23            map.put(x, map.get(x) - 1);
24            if(map.get(x) == 0){
25                map.remove(x);
26            }
27        }
28        return max;
29    }
30}
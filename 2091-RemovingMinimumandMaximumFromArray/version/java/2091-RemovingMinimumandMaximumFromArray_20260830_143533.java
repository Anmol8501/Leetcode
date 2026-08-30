// Last updated: 8/30/2026, 2:35:33 PM
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        
4        int n = nums.length;
5        int min = Integer.MAX_VALUE;
6        int max = Integer.MIN_VALUE;
7
8        int minIndex = -1;
9        int maxIndex = -1;
10
11        for (int i = 0; i < n; i++) {
12            if (nums[i] < min) {
13                min = nums[i];
14                minIndex = i;
15            }
16
17            if (nums[i] > max) {
18                max = nums[i];
19                maxIndex = i;
20            }
21        }
22
23        int left = Math.max(minIndex, maxIndex) + 1;
24
25        int right = n - Math.min(minIndex, maxIndex);
26
27        int both = Math.min(minIndex, maxIndex) + 1
28                 + n - Math.max(minIndex, maxIndex);
29
30        return Math.min(left, Math.min(right, both));
31    }
32}
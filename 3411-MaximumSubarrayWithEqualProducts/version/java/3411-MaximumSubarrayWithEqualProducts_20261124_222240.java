// Last updated: 11/24/2026, 10:22:40 PM
1class Solution {
2    public int maxLength(int[] nums) {
3        int[] mask = {0, 0, 1, 2, 1, 4, 3, 8, 1, 2, 5};
4
5        int n = nums.length;
6        int used = 0, l = 0;
7        int ans = 2;
8
9        for (int r = 0; r < n; r++) {
10            while ((used & mask[nums[r]]) != 0) {
11                used ^= mask[nums[l]];
12                l++;
13            }
14            used |= mask[nums[r]];
15            ans = Math.max(ans, r - l + 1);
16        }
17
18        return ans;
19    }
20}
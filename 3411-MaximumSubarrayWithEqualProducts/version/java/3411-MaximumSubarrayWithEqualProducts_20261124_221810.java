// Last updated: 11/24/2026, 10:18:10 PM
1class Solution {
2    private long gcd(long a, long b) {
3        return b == 0 ? a : gcd(b, a % b);
4    }
5
6    public int maxLength(int[] nums) {
7        int n = nums.length;
8        int ans = 1;
9
10        for (int i = 0; i < n; i++) {
11            long prod = nums[i], g = nums[i], l = nums[i];
12
13            for (int j = i + 1; j < n; j++) {
14                prod *= nums[j];
15                g = gcd(g, nums[j]);
16                l = l / gcd(l, nums[j]) * nums[j];
17
18                if (prod > g * l) break;
19                if (prod == g * l) ans = Math.max(ans, j - i + 1);
20            }
21        }
22
23        return ans;
24    }
25}
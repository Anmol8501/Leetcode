// Last updated: 11/24/2026, 10:11:54 PM
1class Solution {
2    private int gcd(int a, int b) {
3        return b == 0 ? a : gcd(b, a % b);
4    }
5
6    public int maxLength(int[] nums) {
7        int n = nums.length;
8        final long LIMIT = 25200;
9        int ans = 1;
10
11        for (int i = 0; i < n; i++) {
12            for (int j = i; j < n; j++) {
13                long prod = 1;
14                int g = 0, l = 1;
15                boolean ok = true;
16
17                for (int k = i; k <= j; k++) {
18                    prod *= nums[k];
19                    if (prod > LIMIT) { ok = false; break; }
20                    g = gcd(g, nums[k]);
21                    l = l / gcd(l, nums[k]) * nums[k];
22                }
23                if (ok && prod == (long) g * l) ans = Math.max(ans, j - i + 1);
24            }
25        }
26        return ans;
27    }
28}
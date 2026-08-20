// Last updated: 8/20/2026, 10:57:24 AM
1class Solution {
2    public int integerBreak(int n) {
3
4        int[] dp = new int[n + 1];
5
6        dp[1] = 1;
7
8        for (int i = 2; i <= n; i++) {
9
10            for (int j = 1; j < i; j++) {
11                dp[i] = Math.max(dp[i],
12                        j * Math.max(i - j, dp[i - j]));
13            }
14        }
15
16        return dp[n];
17    }
18}
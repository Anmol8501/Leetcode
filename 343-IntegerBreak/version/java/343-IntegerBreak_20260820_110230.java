// Last updated: 8/20/2026, 11:02:30 AM
1class Solution {
2    int[] dp;
3
4    public int integerBreak(int n) {
5        if(n<4) return n-1;
6        if(n==4) return 4;
7        dp = new int[n + 1];
8        Arrays.fill(dp, -1);
9
10        return solve(n);
11    }
12
13    private int solve(int n) {
14
15        if (n == 3) return 3;
16
17        if (dp[n] != -1)
18            return dp[n];
19
20        int result = Integer.MIN_VALUE;
21
22        for (int i = 1; i < n; i++) {
23            int prod = i * solve(n - i);
24            result = Math.max(result, prod);
25        }
26
27        dp[n] = result;
28        return result;
29    }
30}
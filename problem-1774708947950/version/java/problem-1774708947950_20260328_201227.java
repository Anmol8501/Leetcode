// Last updated: 3/28/2026, 8:12:27 PM
1class Solution {
2    static final long MOD = 1_000_000_007L;
3
4    public int countArrays(int[] digitSum) {
5        int n = digitSum.length;
6
7        // Max digit sum of any number 0..5000 is 4+9+9+9 = 31
8        // But digitSum[i] input can be anything, so use 5001 as safe upper bound
9        int MAXS = 5001;
10        int[] cnt = new int[MAXS];
11        for (int num = 0; num <= 5000; num++) {
12            int s = 0, x = num;
13            while (x > 0) { s += x % 10; x /= 10; }
14            cnt[s]++;
15        }
16
17        int[][] groups = new int[MAXS][];
18        for (int s = 0; s < MAXS; s++) groups[s] = new int[cnt[s]];
19
20        int[] idx = new int[MAXS];
21        for (int num = 0; num <= 5000; num++) {
22            int s = 0, x = num;
23            while (x > 0) { s += x % 10; x /= 10; }
24            groups[s][idx[s]++] = num;
25        }
26
27        // If any digitSum[i] has no valid numbers, answer is 0
28        for (int ds : digitSum) {
29            if (ds >= MAXS || groups[ds].length == 0) return 0;
30        }
31
32        long[] dp = new long[groups[digitSum[0]].length];
33        Arrays.fill(dp, 1L);
34
35        for (int i = 1; i < n; i++) {
36            int[] prev = groups[digitSum[i - 1]];
37            int[] cur  = groups[digitSum[i]];
38
39            long[] prefix = new long[prev.length + 1];
40            for (int p = 0; p < prev.length; p++) {
41                prefix[p + 1] = (prefix[p] + dp[p]) % MOD;
42            }
43
44            long[] newDp = new long[cur.length];
45            int pi = 0;
46            for (int j = 0; j < cur.length; j++) {
47                while (pi < prev.length && prev[pi] <= cur[j]) pi++;
48                newDp[j] = prefix[pi];
49            }
50            dp = newDp;
51        }
52
53        long ans = 0;
54        for (long v : dp) ans = (ans + v) % MOD;
55        return (int) ans;
56    }
57}
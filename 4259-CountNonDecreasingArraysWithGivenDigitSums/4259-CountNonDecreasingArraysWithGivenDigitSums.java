// Last updated: 4/21/2026, 2:24:05 PM
class Solution {
    static final long MOD = 1_000_000_007L;

    public int countArrays(int[] digitSum) {
        int n = digitSum.length;

        // Max digit sum of any number 0..5000 is 4+9+9+9 = 31
        // But digitSum[i] input can be anything, so use 5001 as safe upper bound
        int MAXS = 5001;
        int[] cnt = new int[MAXS];
        for (int num = 0; num <= 5000; num++) {
            int s = 0, x = num;
            while (x > 0) { s += x % 10; x /= 10; }
            cnt[s]++;
        }

        int[][] groups = new int[MAXS][];
        for (int s = 0; s < MAXS; s++) groups[s] = new int[cnt[s]];

        int[] idx = new int[MAXS];
        for (int num = 0; num <= 5000; num++) {
            int s = 0, x = num;
            while (x > 0) { s += x % 10; x /= 10; }
            groups[s][idx[s]++] = num;
        }

        // If any digitSum[i] has no valid numbers, answer is 0
        for (int ds : digitSum) {
            if (ds >= MAXS || groups[ds].length == 0) return 0;
        }

        long[] dp = new long[groups[digitSum[0]].length];
        Arrays.fill(dp, 1L);

        for (int i = 1; i < n; i++) {
            int[] prev = groups[digitSum[i - 1]];
            int[] cur  = groups[digitSum[i]];

            long[] prefix = new long[prev.length + 1];
            for (int p = 0; p < prev.length; p++) {
                prefix[p + 1] = (prefix[p] + dp[p]) % MOD;
            }

            long[] newDp = new long[cur.length];
            int pi = 0;
            for (int j = 0; j < cur.length; j++) {
                while (pi < prev.length && prev[pi] <= cur[j]) pi++;
                newDp[j] = prefix[pi];
            }
            dp = newDp;
        }

        long ans = 0;
        for (long v : dp) ans = (ans + v) % MOD;
        return (int) ans;
    }
}
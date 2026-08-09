// Last updated: 8/9/2026, 6:04:29 PM
class Solution {

    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans = (power(5, even) * power(4, odd)) % MOD;

        return (int) ans;
    }

    private long power(long x, long n) {

        long ans = 1;

        while (n > 0) {

            if ((n % 2) == 1)
                ans = (ans * x) % MOD;

            x = (x * x) % MOD;
            n=n/2;
        }

        return ans;
    }
}
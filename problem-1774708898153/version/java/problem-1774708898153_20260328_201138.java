// Last updated: 3/28/2026, 8:11:38 PM
1class Solution {
2    static final long MOD = 1_000_000_007L;
3    
4    public int countVisiblePeople(int n, int pos, int k) {
5        long[] fact = new long[n + 1];
6        long[] inv_fact = new long[n + 1];
7        
8        fact[0] = 1;
9        for (int i = 1; i <= n; i++) {
10            fact[i] = fact[i-1] * i % MOD;
11        }
12        
13        inv_fact[n] = modPow(fact[n], MOD - 2, MOD);
14        for (int i = n - 1; i >= 0; i--) {
15            inv_fact[i] = inv_fact[i+1] * (i+1) % MOD;
16        }
17        
18        int L = pos;      
19        int R = n - 1 - pos; 
20        
21        long ans = 0;
22        for (int j = 0; j <= k; j++) {
23            int r = k - j;
24            if (j <= L && r <= R) {
25                long combL = fact[L] * inv_fact[j] % MOD * inv_fact[L-j] % MOD;
26                long combR = fact[R] * inv_fact[r] % MOD * inv_fact[R-r] % MOD;
27                ans = (ans + combL * combR) % MOD;
28            }
29        }
30        
31        // Person at pos freely picks 'L' or 'R' → multiply by 2
32        return (int)(ans * 2 % MOD);
33    }
34    
35    private long modPow(long base, long exp, long mod) {
36        long result = 1;
37        base %= mod;
38        while (exp > 0) {
39            if ((exp & 1) == 1) result = result * base % mod;
40            base = base * base % mod;
41            exp >>= 1;
42        }
43        return result;
44    }
45}
// Last updated: 4/2/2026, 11:07:25 PM
1class Solution {
2    public int[] decrypt(int[] code, int k) {
3        int n = code.length;
4        int[] res = new int[n];
5        if (k == 0) return res;
6        int windowSize = Math.abs(k);
7        int sum = 0;
8        for (int i = 1; i <= windowSize; i++) {
9            int idx = (k > 0) ? i : n - i;
10            sum += code[idx];
11        }
12        for (int i = 0; i < n; i++) {
13            res[i] = sum;
14            int removeIdx = (k > 0) ? (i + 1) % n : (i + n - windowSize) % n;
15            int addIdx = (k > 0) ? (i + 1 + windowSize) % n : i;
16            sum -= code[removeIdx];
17            sum += code[addIdx];
18        }
19        return res;
20    }
21}
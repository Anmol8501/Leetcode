// Last updated: 3/24/2026, 8:08:50 PM
1class Solution {
2    public int[][] constructProductMatrix(int[][] grid) {
3    int m = grid.length;
4    int n = grid[0].length;
5    int mod = 12345;
6
7    int[][] suffix = new int[m][n];
8    int[][] res = new int[m][n];
9    long suff = 1;
10    for (int i = m - 1; i >= 0; i--) {
11        for (int j = n - 1; j >= 0; j--) {
12            suffix[i][j] = (int)(suff % mod);
13            suff = (suff * grid[i][j]) % mod;
14        }
15    }
16    long pref = 1;
17    for (int i = 0; i < m; i++) {
18        for (int j = 0; j < n; j++) {
19            res[i][j] = (int)((pref * suffix[i][j]) % mod);
20            pref = (pref * grid[i][j]) % mod;
21        }
22    }
23    return res;
24    }
25}
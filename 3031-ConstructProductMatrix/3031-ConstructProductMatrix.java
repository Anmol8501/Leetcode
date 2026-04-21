// Last updated: 4/21/2026, 2:24:45 PM
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
    int m = grid.length, n = grid[0].length;
    int mod = 12345;
    int[][] res = new int[m][n];
    long pref = 1;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            res[i][j] = (int) pref;
            pref = (pref * grid[i][j]) % mod;
        }
    }
    long suff = 1;
    for (int i = m - 1; i >= 0; i--) {
        for (int j = n - 1; j >= 0; j--) {
            res[i][j] = (int) ((res[i][j] * suff) % mod);
            suff = (suff * grid[i][j]) % mod;
        }
    }
    return res;
    }
}
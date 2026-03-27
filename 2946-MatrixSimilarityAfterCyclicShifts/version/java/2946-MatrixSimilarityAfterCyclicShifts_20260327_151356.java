// Last updated: 3/27/2026, 3:13:56 PM
1class Solution {
2    public boolean areSimilar(int[][] mat, int k) {
3        int m = mat.length;
4        int n = mat[0].length;
5        int shift = k % n;
6        for (int i = 0; i < m; i++) {
7            for (int j = 0; j < n; j++) {
8                int newCol;
9                if (i % 2 == 0) {
10                    newCol = (j + shift) % n;
11                } else {
12                    newCol = (j - shift + n) % n;
13                }
14                if (mat[i][j] != mat[i][newCol]) {
15                    return false;
16                }
17            }
18        }
19        return true;
20    }
21}
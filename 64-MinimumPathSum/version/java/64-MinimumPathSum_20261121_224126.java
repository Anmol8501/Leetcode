// Last updated: 11/21/2026, 10:41:26 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        for(int i = 0; i < m; i++){
7            for(int j = 0; j < n; j++){
8                if(i > 0 && j > 0)
9                    grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
10                else if(i > 0)
11                    grid[i][0] += grid[i-1][0];
12                else if(j > 0)
13                    grid[0][j] += grid[0][j-1];
14            }
15        }
16        return grid[m-1][n-1];
17    }
18}
// Last updated: 10/18/2026, 8:48:30 AM
1class Solution {
2    public int[] lastVisitedCell(char[][] grid) {
3        int row = grid.length;
4        int col = grid[0].length;
5        boolean[][] visited = new boolean[row][col];
6        int r = 0, c = 0;
7
8        while(r < row && c < col && !visited[r][c]){
9            visited[r][c] = true;
10            if(grid[r][c] == 'R' && c < col-1 && !visited[r][c+1]) c++;
11            else if(grid[r][c] == 'L' && c > 0 && !visited[r][c-1]) c--;
12            else if(grid[r][c] == 'D' && r < row-1 && !visited[r+1][c]) r++;
13            else if(grid[r][c] == 'U' && r > 0 && !visited[r-1][c]) r--;
14        }
15        return new int[]{r,c};
16    }
17}
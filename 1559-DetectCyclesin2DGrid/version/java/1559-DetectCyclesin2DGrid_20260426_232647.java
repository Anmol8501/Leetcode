// Last updated: 4/26/2026, 11:26:47 PM
1class Solution {
2    int m,n;
3    int[][] direction={{1,0},{-1,0},{0,-1},{0,1}};
4
5    public boolean containsCycle(char[][] grid) {
6        int m=grid.length;
7        int n=grid[0].length;
8        boolean[][] visited=new boolean[m][n];
9
10        for(int i=0;i<m;i++){
11            for(int j=0;j<n;j++){
12                if(!visited[i][j] && cycledfs(i,j,i,j,grid,visited))
13                    return true;
14            }      
15        }
16        return false;
17    }
18
19    private boolean cycledfs(int r, int c, int prevr, int prevc, char[][] grid, boolean[][] visited) {
20    visited[r][c] = true;
21
22    for(int[] dir : direction){
23        int newr = r + dir[0];
24        int newc = c + dir[1];
25
26        if(newr >= 0 && newr < grid.length && newc >= 0 && newc < grid[0].length 
27           && grid[newr][newc] == grid[r][c]){
28
29            if(newr == prevr && newc == prevc) continue;
30
31            if(visited[newr][newc]) return true;
32
33            if(cycledfs(newr, newc, r, c, grid, visited)) return true;
34        }
35    }
36    return false;
37    }
38}
// Last updated: 4/28/2026, 8:01:42 PM
class Solution {
    int m,n;
    int[][] direction={{1,0},{-1,0},{0,-1},{0,1}};

    public boolean containsCycle(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && cycledfs(i,j,i,j,grid,visited))
                    return true;
            }      
        }
        return false;
    }

    private boolean cycledfs(int r, int c, int prevr, int prevc, char[][] grid, boolean[][] visited) {
    visited[r][c] = true;

    for(int[] dir : direction){
        int newr = r + dir[0];
        int newc = c + dir[1];

        if(newr >= 0 && newr < grid.length && newc >= 0 && newc < grid[0].length 
           && grid[newr][newc] == grid[r][c]){

            if(newr == prevr && newc == prevc) continue;

            if(visited[newr][newc]) return true;

            if(cycledfs(newr, newc, r, c, grid, visited)) return true;
        }
    }
    return false;
    }
}
// Last updated: 3/7/2026, 10:12:36 PM
class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int count = 0;

        for(int i = 0; i < rows - 2; i++){
            for(int j = 0; j < cols - 2; j++){
                if(isMagic(grid, i, j)) count++;
            }
        }
        return count;
    }

    private boolean isMagic(int[][] g, int r, int c){
        boolean[] seen = new boolean[10]; 
        for(int i = r; i < r + 3; i++){
            for(int j = c; j < c + 3; j++){
                int num = g[i][j];
                if(num < 1 || num > 9 || seen[num]) return false;
                seen[num] = true;
            }
        }

        int row1 = g[r][c] + g[r][c+1] + g[r][c+2];
        int row2 = g[r+1][c] + g[r+1][c+1] + g[r+1][c+2];
        int row3 = g[r+2][c] + g[r+2][c+1] + g[r+2][c+2];
int col1 = g[r][c] + g[r+1][c] + g[r+2][c];
        int col2 = g[r][c+1] + g[r+1][c+1] + g[r+2][c+1];
        int col3 = g[r][c+2] + g[r+1][c+2] + g[r+2][c+2];

        int diag1 = g[r][c] + g[r+1][c+1] + g[r+2][c+2];
        int diag2 = g[r][c+2] + g[r+1][c+1] + g[r+2][c];

        return row1 == 15 && row2 == 15 && row3 == 15 &&
               col1 == 15 && col2 == 15 && col3 == 15 &&
               diag1 == 15 && diag2 == 15;
    }
}
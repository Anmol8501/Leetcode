// Last updated: 4/21/2026, 2:24:31 PM
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        long sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
            }
        }
        long rowsum=0,colsum=0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                rowsum+=grid[i][j];
            }
            if(rowsum*2==sum) return true;
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m;j++){
                colsum+=grid[j][i];
            }
            if(colsum*2==sum) return true;
        }
        return false;
    }
}
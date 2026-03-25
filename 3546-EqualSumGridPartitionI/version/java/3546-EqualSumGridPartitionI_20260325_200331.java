// Last updated: 3/25/2026, 8:03:31 PM
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        int m=grid.length;
4        int n=grid[0].length;
5        long sum=0;
6        for(int i=0;i<m;i++){
7            for(int j=0;j<n;j++){
8                sum+=grid[i][j];
9            }
10        }
11        long rowsum=0,colsum=0;
12        for(int i=0;i<m-1;i++){
13            for(int j=0;j<n;j++){
14                rowsum+=grid[i][j];
15            }
16            if(rowsum*2==sum) return true;
17        }
18        for(int i=0;i<n-1;i++){
19            for(int j=0;j<m;j++){
20                colsum+=grid[j][i];
21            }
22            if(colsum*2==sum) return true;
23        }
24        return false;
25    }
26}
// Last updated: 3/31/2026, 3:34:29 PM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        boolean[] row = new boolean[m];
6        boolean[] col = new boolean[n];
7
8        for(int i=0;i<m;i++){
9            for(int j=0;j<n;j++){
10                if(matrix[i][j]==0){
11                    row[i]=true;
12                    col[j]=true;
13                }
14            }
15        }
16        for(int i=0;i<m;i++){
17            for(int j=0;j<n;j++){
18                if(row[i] || col[j]) matrix[i][j]=0;
19            }
20        }
21    }
22}
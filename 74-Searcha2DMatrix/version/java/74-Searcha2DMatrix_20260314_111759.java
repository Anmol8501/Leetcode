// Last updated: 3/14/2026, 11:17:59 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int row=0,col=matrix[0].length-1;
4        while(row<matrix.length && col>=0){
5            if(matrix[row][col]==target) return true;
6            else if(matrix[row][col]>target) col--;
7            else row++;
8        }
9        return false;
10    }
11}
// Last updated: 8/31/2026, 8:10:55 PM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        int[] arr=new int[m*n];
6        int i=0;
7        for(int col=0;col<n;col++){
8            for(int row=m-1;row>=0;row--){
9                arr[i++]=matrix[row][col];
10            }
11        }
12        i=0;
13        for(int row=0;row<m;row++){
14            for(int col=0;col<n;col++){
15                matrix[row][col]=arr[i++];
16            }
17        }
18    }
19}
// Last updated: 3/29/2026, 8:31:05 PM
1class Solution {
2    public int[] rowAndMaximumOnes(int[][] mat) {
3        int[] arr=new int[2];
4        for(int i=0;i<mat.length;i++){
5            int one=0;
6            for(int j=0;j<mat[0].length;j++){
7                if(mat[i][j]==1) one++;
8            }
9            if(one>arr[1]){
10                arr[1]=one;
11                arr[0]=i;
12            }
13        }
14        return arr;
15    }
16}
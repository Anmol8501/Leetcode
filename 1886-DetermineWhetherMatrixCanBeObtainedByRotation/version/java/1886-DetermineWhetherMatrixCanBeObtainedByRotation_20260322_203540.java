// Last updated: 3/22/2026, 8:35:40 PM
1class Solution {
2    public boolean findRotation(int[][] mat, int[][] target) {
3        int n=mat.length;
4        for(int k=0;k<4;k++){
5        boolean equal=true;
6        for(int i=0;i<n;i++){
7            for(int j=0;j<n;j++){
8                if(mat[i][j]!=target[i][j]){
9                    equal=false;
10                    break;
11            }}}
12        if(equal) return true;
13        rotate(mat,n);
14        }
15        return false;
16    }
17    static void rotate(int[][] mat,int n){
18        for(int i=0;i<n;i++){
19            for(int j=i+1;j<n;j++){
20                int temp=mat[i][j];
21                mat[i][j]=mat[j][i];
22                mat[j][i]=temp;
23            }}
24        for(int i=0;i<n;i++){
25            for(int j=0;j<n/2;j++){
26                int temp=mat[i][j];
27                mat[i][j]=mat[i][n-j-1];
28                mat[i][n-j-1]=temp;
29            }}
30    }
31}
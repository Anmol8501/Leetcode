// Last updated: 4/21/2026, 2:25:09 PM
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        for(int k=0;k<4;k++){
        boolean equal=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]){
                    equal=false;
                    break;
            }}}
        if(equal) return true;
        rotate(mat,n);
        }
        return false;
    }
    static void rotate(int[][] mat,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }}
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-j-1];
                mat[i][n-j-1]=temp;
            }}
    }
}
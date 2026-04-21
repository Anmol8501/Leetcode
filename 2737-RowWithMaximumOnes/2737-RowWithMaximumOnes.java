// Last updated: 4/21/2026, 2:24:51 PM
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr=new int[2];
        for(int i=0;i<mat.length;i++){
            int one=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) one++;
            }
            if(one>arr[1]){
                arr[1]=one;
                arr[0]=i;
            }
        }
        return arr;
    }
}
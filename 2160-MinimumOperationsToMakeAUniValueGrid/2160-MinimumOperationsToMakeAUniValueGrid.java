// Last updated: 4/28/2026, 8:00:19 PM
class Solution {
    public int minOperations(int[][] grid, int x) {

        int m=grid.length;
        int n=grid[0].length;
        int mod=grid[0][0]%x;

        if(m==1 && n==1) return 0 ;
        
        int k=0,opr=0;
        int[] arr=new int[m*n];

        for (int[] row : grid) {
            for (int val : row) {
                if (val % x != mod) return -1;
                arr[k++] = val;
            }
        }

        Arrays.sort(arr);
        int mid=arr[arr.length/2];

         for (int val : arr) {
            opr += Math.abs(val - mid) / x;
        }

        return opr;
    }
}
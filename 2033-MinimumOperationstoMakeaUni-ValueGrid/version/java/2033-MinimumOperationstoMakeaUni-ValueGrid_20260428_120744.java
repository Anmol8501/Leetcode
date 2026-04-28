// Last updated: 4/28/2026, 12:07:44 PM
1class Solution {
2    public int minOperations(int[][] grid, int x) {
3        int m=grid.length;
4        int n=grid[0].length;
5        int mod=grid[0][0]%x;
6
7        int k=0,opr=0;
8        int[] arr=new int[m*n];
9
10        for(int i=0;i<m;i++){
11            for(int j=0;j<n;j++){
12
13                if(grid[i][j]%x==mod)
14                    arr[k++]=grid[i][j];
15                else return -1;
16            }
17        }
18
19        Arrays.sort(arr);
20        int mid=arr[(m*n)/2];
21        for(int i=0;i<m*n;i++){
22            opr+=Math.abs(arr[i]-mid)/x;
23        }
24        return opr;
25    }
26}
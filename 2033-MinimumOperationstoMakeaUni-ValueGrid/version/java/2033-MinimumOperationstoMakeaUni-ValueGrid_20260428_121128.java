// Last updated: 4/28/2026, 12:11:28 PM
1class Solution {
2    public int minOperations(int[][] grid, int x) {
3
4        int m=grid.length;
5        int n=grid[0].length;
6        int mod=grid[0][0]%x;
7
8        if(m==1 && n==1) return 0 ;
9        
10        int k=0,opr=0;
11        int[] arr=new int[m*n];
12
13        for (int[] row : grid) {
14            for (int val : row) {
15                if (val % x != mod) return -1;
16                arr[k++] = val;
17            }
18        }
19
20        Arrays.sort(arr);
21        int mid=arr[arr.length/2];
22
23         for (int val : arr) {
24            opr += Math.abs(val - mid) / x;
25        }
26
27        return opr;
28    }
29}
// Last updated: 4/28/2026, 12:00:12 PM
1class Solution {
2    public int minOperations(int[][] grid, int x) {
3        
4        int m=grid.length;
5        int n=grid[0].length;
6        int mod=grid[0][0]%x;
7
8        int k=0,opr=0;
9        int[] arr=new int[m*n];
10
11        for(int i=0;i<m;i++){
12            for(int j=0;j<n;j++){
13
14                if(grid[i][j]%x==mod)
15                    arr[k++]=grid[i][j];
16                else return -1;
17            }
18        }
19
20        Arrays.sort(arr);
21        int mid=arr[(m*n)/2];
22
23        for(int i=0;i<m*n;i++){
24            while(arr[i]!=mid){
25
26                if(arr[i]>mid) arr[i]-=x;
27                else arr[i]+=x;
28                opr++;
29            }
30        }
31
32        return opr;
33    }
34}
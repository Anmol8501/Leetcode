// Last updated: 3/23/2026, 11:01:35 PM
1class Solution {
2    public int earliestTime(int[][] tasks) {
3        int mintime=Integer.MAX_VALUE;
4        for(int[] arr:tasks){
5            int sum=arr[0]+arr[1];
6            mintime=Math.min(sum,mintime);
7        }
8        return mintime;
9    }
10}
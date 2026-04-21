// Last updated: 4/21/2026, 2:24:28 PM
class Solution {
    public int earliestTime(int[][] tasks) {
        int mintime=Integer.MAX_VALUE;
        for(int[] arr:tasks){
            int sum=arr[0]+arr[1];
            mintime=Math.min(sum,mintime);
        }
        return mintime;
    }
}
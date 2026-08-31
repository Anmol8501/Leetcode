// Last updated: 8/31/2026, 8:03:22 PM
1class Solution {
2    public int findPoisonedDuration(int[] timeSeries, int duration) {
3        int n=timeSeries.length;
4        int count=0;
5
6        for(int i=0;i<n-1;i++){
7            count+=Math.min(duration, timeSeries[i+1]-timeSeries[i]);
8        }
9
10        return count+duration;
11    }
12}
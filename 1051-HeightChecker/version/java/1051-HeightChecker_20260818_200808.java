// Last updated: 8/18/2026, 8:08:08 PM
1class Solution {
2    public int heightChecker(int[] heights) {
3        int n=heights.length;
4        int[] list=new int[n];
5        for(int i=0;i<n;i++){
6            list[i]=heights[i];
7        }
8        Arrays.sort(list);
9        int count=0;
10        for(int i=0;i<n;i++){
11            if(list[i]!=heights[i]) count++;
12        }
13        return count;
14    }
15}
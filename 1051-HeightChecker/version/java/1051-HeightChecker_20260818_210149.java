// Last updated: 8/18/2026, 9:01:49 PM
1class Solution {
2    public int heightChecker(int[] heights) {
3
4        int max = heights[0];
5        for(int i = 1 ; i < heights.length ; i++ ){
6            if(max<heights[i]) max = heights[i];
7        }
8
9        int[] freq = new int[max+1];
10        for(int height : heights){
11            freq[height]++;
12        }
13
14        int count = 0;
15        int index=0;
16        for(int i=1; i<=max;i++){
17
18            while(freq[i] > 0){
19                if(heights[index]!=i) count++;
20
21                index++;
22                freq[i]--;
23            }
24        }
25
26        return count;
27    }
28}
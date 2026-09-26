// Last updated: 9/26/2026, 10:33:46 PM
1class Solution {
2    public boolean canTransform(int[] source, int[] target) {
3        long sum1 = 0;
4        long sum2 = 0;
5
6        for(int i=0;i<source.length;i++){
7            sum1+=source[i];
8            sum2+=target[i];
9        }
10        return sum1==sum2;
11    }
12}
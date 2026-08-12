// Last updated: 8/12/2026, 7:58:29 PM
1class Solution {
2    public int binaryGap(int n) {
3        int dist = 0;
4        int maxDist = 0;
5        boolean foundOne = false;
6        while (n != 0) {
7            int a = n & 1;
8            if (a == 1) {
9                if (foundOne) {
10                    maxDist = Math.max(maxDist, dist);
11                }
12                foundOne = true;
13                dist = 1;
14            } else if (foundOne) {
15                dist++;
16            }
17            n >>= 1;
18        }
19        return maxDist;
20    }
21}
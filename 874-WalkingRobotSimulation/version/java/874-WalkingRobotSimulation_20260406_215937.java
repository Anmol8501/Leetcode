// Last updated: 4/6/2026, 9:59:37 PM
1class Solution {
2    public int robotSim(int[] commands, int[][] obstacles) {
3        int x = 0, y = 0;
4        int d = 0;
5        int maxDist = 0;
6        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
7        Set<Long> obs = new HashSet<>();
8        for (int[] o : obstacles) {
9            long key = ((long)o[0] << 32) | (o[1] & 0xffffffffL);
10            obs.add(key);
11        }
12        for (int cmd : commands) {
13            if (cmd == -1) {
14                d = (d + 1) % 4;
15            } else if (cmd == -2) {
16                d = (d + 3) % 4;
17            } else {
18                for (int step = 0; step < cmd; step++) {
19                    int nx = x + dir[d][0];
20                    int ny = y + dir[d][1];
21                    long key = ((long)nx << 32) | (ny & 0xffffffffL);
22                    if (obs.contains(key)) break;
23                    x = nx;
24                    y = ny;
25                    maxDist = Math.max(maxDist, x * x + y * y);
26                }
27            }
28        }
29        return maxDist;
30    }
31}
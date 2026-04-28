// Last updated: 4/28/2026, 8:02:19 PM
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0;
        int d = 0;
        int maxDist = 0;
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        Set<Long> obs = new HashSet<>();
        for (int[] o : obstacles) {
            long key = ((long)o[0] << 32) | (o[1] & 0xffffffffL);
            obs.add(key);
        }
        for (int cmd : commands) {
            if (cmd == -1) {
                d = (d + 1) % 4;
            } else if (cmd == -2) {
                d = (d + 3) % 4;
            } else {
                for (int step = 0; step < cmd; step++) {
                    int nx = x + dir[d][0];
                    int ny = y + dir[d][1];
                    long key = ((long)nx << 32) | (ny & 0xffffffffL);
                    if (obs.contains(key)) break;
                    x = nx;
                    y = ny;
                    maxDist = Math.max(maxDist, x * x + y * y);
                }
            }
        }
        return maxDist;
    }
}
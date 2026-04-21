// Last updated: 4/21/2026, 2:24:13 PM
class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][][] visited = new boolean[m][n][1024];

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, grid[0][0]});
        visited[0][0][grid[0][0]] = true;

        int[] dr = {0, 1};
        int[] dc = {1, 0};

        int ans = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1], xor = cur[2];

            // reached end
            if (r == m - 1 && c == n - 1) {
                ans = Math.min(ans, xor);
                continue;
            }

            for (int k = 0; k < 2; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr < m && nc < n) {
                    int newXor = xor ^ grid[nr][nc];

                    if (!visited[nr][nc][newXor]) {
                        visited[nr][nc][newXor] = true;
                        q.offer(new int[]{nr, nc, newXor});
                    }
                }
            }
        }

        return ans;
    }
}
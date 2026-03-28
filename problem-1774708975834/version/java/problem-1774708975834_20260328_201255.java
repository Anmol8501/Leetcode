// Last updated: 3/28/2026, 8:12:55 PM
1class Solution {
2    public int minCost(int[][] grid) {
3        int m = grid.length, n = grid[0].length;
4        boolean[][][] visited = new boolean[m][n][1024];
5
6        Queue<int[]> q = new LinkedList<>();
7        q.offer(new int[]{0, 0, grid[0][0]});
8        visited[0][0][grid[0][0]] = true;
9
10        int[] dr = {0, 1};
11        int[] dc = {1, 0};
12
13        int ans = Integer.MAX_VALUE;
14
15        while (!q.isEmpty()) {
16            int[] cur = q.poll();
17            int r = cur[0], c = cur[1], xor = cur[2];
18
19            // reached end
20            if (r == m - 1 && c == n - 1) {
21                ans = Math.min(ans, xor);
22                continue;
23            }
24
25            for (int k = 0; k < 2; k++) {
26                int nr = r + dr[k];
27                int nc = c + dc[k];
28
29                if (nr < m && nc < n) {
30                    int newXor = xor ^ grid[nr][nc];
31
32                    if (!visited[nr][nc][newXor]) {
33                        visited[nr][nc][newXor] = true;
34                        q.offer(new int[]{nr, nc, newXor});
35                    }
36                }
37            }
38        }
39
40        return ans;
41    }
42}
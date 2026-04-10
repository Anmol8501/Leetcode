// Last updated: 4/10/2026, 10:36:46 PM
1class Solution {
2    public int minimumDistance(int[] nums) {
3        int n = nums.length;
4        ArrayList<Integer>[] pos = new ArrayList[101];
5        for (int i = 0; i <= 100; i++) {
6            pos[i] = new ArrayList<>();
7        }
8        for (int i = 0; i < n; i++) {
9            pos[nums[i]].add(i);
10        }
11
12        int ans = Integer.MAX_VALUE;
13        for (int v = 0; v <= 100; v++) {
14            if (pos[v].size() < 3) continue;
15            for (int i = 0; i <= pos[v].size() - 3; i++) {
16                int a = pos[v].get(i);
17                int b = pos[v].get(i + 1);
18                int c = pos[v].get(i + 2);
19                int dist = Math.abs(a - b) + Math.abs(b - c) + Math.abs(a - c);
20                ans = Math.min(ans, dist);
21            }
22        }
23        return ans == Integer.MAX_VALUE ? -1 : ans;
24    }
25}
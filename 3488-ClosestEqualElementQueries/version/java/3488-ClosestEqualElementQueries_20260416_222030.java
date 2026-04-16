// Last updated: 4/16/2026, 10:20:30 PM
1class Solution {
2    public List<Integer> solveQueries(int[] nums, int[] queries) {
3        int n = nums.length;
4
5        Map<Integer, List<Integer>> positions = new HashMap<>();
6
7        for (int i = 0; i < n; i++) {
8            positions.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
9        }
10
11        int[] answer = new int[n];
12        Arrays.fill(answer, -1);
13
14        for (List<Integer> pos : positions.values()) {
15            int m = pos.size();
16
17            if (m == 1) continue;
18
19            for (int i = 0; i < m; i++) {
20                int curr = pos.get(i);
21
22                int prev = pos.get((i - 1 + m) % m);
23                int next = pos.get((i + 1) % m);
24
25                int distPrev = Math.abs(curr - prev);
26                distPrev = Math.min(distPrev, n - distPrev);
27
28                int distNext = Math.abs(curr - next);
29                distNext = Math.min(distNext, n - distNext);
30
31                answer[curr] = Math.min(distPrev, distNext);
32            }
33        }
34
35        List<Integer> result = new ArrayList<>();
36
37        for (int idx : queries) {
38            result.add(answer[idx]);
39        }
40
41        return result;
42    }
43}
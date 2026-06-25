// Last updated: 6/25/2026, 9:59:28 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        res.add(new ArrayList<>());
5
6        for(int i:nums){
7            int n = res.size();
8            for(int j=0;j<n;j++){
9                List<Integer> t = new ArrayList<>(res.get(j));
10                t.add(i);
11                res.add(t);
12            }
13        }
14        return res;
15    }
16}
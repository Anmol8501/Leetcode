// Last updated: 8/25/2026, 11:30:40 AM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int num : nums){
5            set.add(num);
6        }
7        int i=1;
8        while(true){
9            if(!set.contains(k*i)) return k*i;
10            i++;
11        }
12    }
13}
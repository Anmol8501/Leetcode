// Last updated: 3/11/2026, 12:39:17 AM
1class Solution {
2    public int[] minOperations(String boxes) {
3        int[] res = new int[boxes.length()];
4      for (int i = 0, ops = 0, cnt = 0; i < boxes.length(); ++i) {
5       res[i] += ops;
6       cnt += boxes.charAt(i) == '1' ? 1 : 0;
7       ops += cnt;
8    }    
9    for (int i = boxes.length() - 1, ops = 0, cnt = 0; i >= 0; --i) {
10        res[i] += ops;
11        cnt += boxes.charAt(i) == '1' ? 1 : 0;
12        ops += cnt;
13    }
14    return res;  
15    }
16}
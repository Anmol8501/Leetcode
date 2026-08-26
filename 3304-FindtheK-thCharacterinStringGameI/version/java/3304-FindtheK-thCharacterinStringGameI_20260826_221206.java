// Last updated: 8/26/2026, 10:12:06 PM
1class Solution {
2    public char kthCharacter(int k) {
3        int len = 1;
4        int shift = 0;
5
6        while (len < k) {
7            len *= 2;
8        }
9        while (len > 1) {
10            int half = len / 2;
11
12            if (k > half) {
13                k -= half;
14                shift++;
15            }
16            len = half;
17        }
18        return (char) ('a' + shift);
19    }
20}
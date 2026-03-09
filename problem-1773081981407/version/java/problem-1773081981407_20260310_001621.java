// Last updated: 3/10/2026, 12:16:21 AM
1class Solution {
2    public int minimumFlips(int n) {
3        int ans = 0, temp = n, l = 0, r = -1;
4        while(temp > 0) {
5            temp >>= 1;
6            r++;
7        }
8        while(l < r) {
9            ans += ((n >> l) & 1) ^ ((n >> r) & 1);
10            l++;
11            r--;
12        }
13        return 2 * ans;
14    }
15}
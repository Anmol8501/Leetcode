// Last updated: 3/15/2026, 9:33:02 PM
1class Solution {
2public:
3    int reverse(int x) {
4        int rev = 0;
5        while(x != 0)
6        {
7            int digit = x % 10;
8            if((rev > INT_MAX / 10) || (rev == INT_MAX / 10 && digit > 7))
9            {
10                return 0;
11            }
12            if((rev < INT_MIN / 10) || (rev == INT_MIN / 10 && digit < -8))
13            {
14                return 0;
15            } 
16            rev = (rev * 10) + digit;
17            x = x / 10;
18        }
19        return rev;
20    }
21};
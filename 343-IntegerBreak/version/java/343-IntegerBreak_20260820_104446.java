// Last updated: 8/20/2026, 10:44:46 AM
1class Solution {
2    public int integerBreak(int n) {
3        if(n<=1) return 0;
4        if(n==2) return 1;
5        if(n==3) return 2;
6        int res=1;
7        while(n>4){
8            res*=3;
9            n-=3;
10        }
11        res*=n;
12        return res;
13    }
14}
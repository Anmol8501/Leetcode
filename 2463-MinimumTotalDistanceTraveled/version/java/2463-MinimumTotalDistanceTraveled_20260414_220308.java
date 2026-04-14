// Last updated: 4/14/2026, 10:03:08 PM
1class Solution {
2    public int smallestRepunitDivByK(int k) {
3        if (k % 2 == 0 || k % 5 == 0)
4            return -1;
5        int n=0;
6        for(int i=1;i<k+1;i++){
7            n=(n*10+1)%k;
8            if(n==0) return i;
9        }
10        return -1;
11    }
12}
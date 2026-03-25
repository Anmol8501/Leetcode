// Last updated: 3/25/2026, 2:28:26 PM
1class Solution {
2    public int tribonacci(int n) {
3        if(n<2) return n;
4        int t0=0,t1=1,t2=1;
5        int val=2;
6        int prev=t1;
7        while(val<n){
8            int tn=t0+t1+t2;
9            t0=t1;
10            t1=t2;
11            t2=tn;
12            val++;
13        }
14        return t2;
15    }
16}
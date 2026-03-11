// Last updated: 3/11/2026, 3:24:31 PM
1class Solution {
2    public int bitwiseComplement(int n) {
3        if(n==0) return 1;
4        int comp=0;
5        int k=1;
6        while(n!=0){
7            int a=n&1;
8            comp+=(a^1)*k;
9            n=n>>1;
10            k*=2;
11        }
12        return comp;
13    }
14}
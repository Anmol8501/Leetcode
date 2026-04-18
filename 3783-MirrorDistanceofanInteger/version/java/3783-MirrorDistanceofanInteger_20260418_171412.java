// Last updated: 4/18/2026, 5:14:12 PM
1class Solution {
2    public int mirrorDistance(int n) {
3        
4        return Math.abs(reverse(n)-n);
5    }
6    private int reverse(int n){
7        int a=0;
8        while(n>0){
9            a=a*10+n%10;
10            n/=10;
11        }
12        return a;
13    }
14}
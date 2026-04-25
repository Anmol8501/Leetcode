// Last updated: 4/25/2026, 8:12:46 PM
1class Solution {
2    public boolean validDigit(int n, int x) {
3        int a=10;
4        boolean bool=false;
5        while(n!=0){
6            if(a==x) bool=true;
7            a=n%10;
8            n/=10;
9        }
10        return bool && (x!=a);
11    }
12}
// Last updated: 9/3/2026, 11:56:01 PM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        long a=0;
4        long b=(long) Math.sqrt(c);
5
6        while(a<=b){
7            long sum=a*a+b*b;
8
9            if(sum==c) return true;
10            else if(sum<c) a++;
11            else b--;
12        }
13        return false;
14    }
15}
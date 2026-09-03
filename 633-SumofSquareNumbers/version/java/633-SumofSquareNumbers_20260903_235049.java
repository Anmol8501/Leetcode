// Last updated: 9/3/2026, 11:50:49 PM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        for(long a=0;a*a<=c;a++){
4            long remaining = c-a*a;
5            long b= (long) Math.sqrt(remaining);
6
7            if(b*b==remaining) return true;
8        }
9        return false;
10    }
11}
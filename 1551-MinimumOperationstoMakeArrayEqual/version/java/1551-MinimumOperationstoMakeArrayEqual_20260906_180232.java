// Last updated: 9/6/2026, 6:02:32 PM
1class Solution {
2    public int minOperations(int n) {
3        if(n%2!=0) return ((n-1)/2)*((n-1)/2+1);
4        else return n/2*(n/2);
5    }
6}
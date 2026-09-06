// Last updated: 9/6/2026, 5:43:37 PM
1class Solution {
2    public int minOperations(int n) {
3        int opr=0;
4
5        for(int i=1;i<n;i+=2){
6            opr+=n-i;
7        }
8        return opr;
9    }
10}
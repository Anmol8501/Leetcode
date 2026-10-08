// Last updated: 10/8/2026, 1:19:42 PM
1class Solution {
2    public int arrangeCoins(int n) {
3        int i = 0;
4        while(n>i){
5            i++;
6            n-=i;
7        }
8        return i;
9    }
10}
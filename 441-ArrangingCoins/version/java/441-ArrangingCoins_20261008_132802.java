// Last updated: 10/8/2026, 1:28:02 PM
1class Solution {
2    public int arrangeCoins(int n) {
3        return ((int)(Math.sqrt(8L*n+1))-1)/2;
4    }
5}
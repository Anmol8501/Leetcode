// Last updated: 9/7/2026, 10:08:17 PM
1class Solution {
2    public int minBishopMoves(int[] source, int[] target) {
3        if(Math.abs(source[0]-target[0]) == Math.abs(source[1]-target[1]))
4            return 1;
5        if((Math.abs(source[0]-target[0])%2 == 0  && Math.abs(source[1]-target[1])%2 != 0) || (Math.abs(source[0]-target[0])%2 != 0  && Math.abs(source[1]-target[1])%2 == 0)) return -1;
6        
7        return 2;
8    }
9}
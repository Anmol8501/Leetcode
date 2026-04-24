// Last updated: 4/24/2026, 9:53:31 PM
1class Solution {
2    public int furthestDistanceFromOrigin(String moves) {
3        int count=0,move=0;
4        for(char ch:moves.toCharArray()){
5            if(ch=='R') count++;
6            else if(ch=='L') count--;
7            else move++;
8        }
9        return Math.abs(count)+move;
10    }
11}
// Last updated: 4/5/2026, 2:55:37 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        if(moves.length()%2!=0) return false;
4        int updown=0,rightleft=0;
5        for(char c:moves.toCharArray()){
6            switch(c){
7                case 'R':rightleft++;
8                break;
9                case 'L':rightleft--;
10                break;
11                case 'U':updown++;
12                break;
13                case 'D':updown--;
14            }
15        }
16        return updown==0 && rightleft==0;
17    }
18}
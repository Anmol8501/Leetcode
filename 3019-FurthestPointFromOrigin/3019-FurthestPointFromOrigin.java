// Last updated: 4/28/2026, 7:59:10 PM
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count=0,move=0;
        for(char ch:moves.toCharArray()){
            if(ch=='R') count++;
            else if(ch=='L') count--;
            else move++;
        }
        return Math.abs(count)+move;
    }
}
// Last updated: 3/7/2026, 10:17:40 PM
class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        while(goal!=0||start!=0){
            int a=start&1;
            int b=goal&1;
            count=count+(a^b);
            start=start>>1;
            goal=goal>>1;
        }
        return count;
    }
}
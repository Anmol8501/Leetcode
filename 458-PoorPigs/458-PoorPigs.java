// Last updated: 4/28/2026, 8:02:41 PM
class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int states=minutesToTest/minutesToDie+1;
        int pigs=0;
        while(Math.pow(states,pigs)<buckets){
            pigs++;
        }
        return pigs;
    }
}
// Last updated: 3/7/2026, 10:18:57 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totaldrunk=0;
        int empty=0;
        while(numBottles>0){
            totaldrunk+=numBottles;
            empty+=numBottles;
            numBottles=empty/numExchange;
            empty=empty%numExchange;
        }

        return totaldrunk;
    }
}
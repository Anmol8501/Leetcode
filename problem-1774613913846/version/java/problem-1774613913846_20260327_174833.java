// Last updated: 3/27/2026, 5:48:33 PM
1class Solution {
2    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
3        int states=minutesToTest/minutesToDie+1;
4        int pigs=0;
5        while(Math.pow(states,pigs)<buckets){
6            pigs++;
7        }
8        return pigs;
9    }
10}
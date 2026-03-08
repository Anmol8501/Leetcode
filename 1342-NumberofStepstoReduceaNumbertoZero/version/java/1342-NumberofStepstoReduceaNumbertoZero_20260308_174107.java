// Last updated: 3/8/2026, 5:41:07 PM
1class Solution {
2    public int numberOfSteps(int num) {
3        return helper(num,0);
4    }
5    private int helper(int n,int steps){
6        if(n==0) return steps;
7        if((n&1)==0) return helper(n/2,steps+1);
8        return helper(n-1,steps+1);
9    }
10}
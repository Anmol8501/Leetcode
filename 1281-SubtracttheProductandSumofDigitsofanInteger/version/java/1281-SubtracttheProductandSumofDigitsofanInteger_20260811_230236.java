// Last updated: 8/11/2026, 11:02:36 PM
1class Solution {
2    public int subtractProductAndSum(int n) {
3        int sum=0;
4        int mul=1;
5        while(n>0){
6            int rem=n%10;
7            sum+=rem;
8            mul*=rem;
9            n/=10;
10        }
11        return mul-sum;
12    }
13}
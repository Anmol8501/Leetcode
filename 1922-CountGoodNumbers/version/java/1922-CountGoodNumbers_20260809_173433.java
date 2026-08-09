// Last updated: 8/9/2026, 5:34:33 PM
1class Solution {
2    long MOD=1000000007;
3    public int countGoodNumbers(long n) {
4        long even_positions = (n + 1)/2;
5        long odd_positions  = n/2;
6        long answer=(power(5,even_positions)*power(4,odd_positions))%MOD;
7        return (int)answer;
8    }
9    private long power(long base,long exponent){
10        long result=1;
11        while(exponent>0){
12            if(exponent%2==1){
13                result = (result*base)%MOD;
14            }
15            base = (base * base) % MOD;
16            exponent = exponent/2;
17        }
18        return result;
19    }
20}
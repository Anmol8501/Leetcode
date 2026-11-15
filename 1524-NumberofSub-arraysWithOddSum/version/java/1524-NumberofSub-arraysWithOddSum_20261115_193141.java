// Last updated: 11/15/2026, 7:31:41 PM
1class Solution {
2    public int numOfSubarrays(int[] arr) {
3        int MOD = 1000000007;
4        int n = arr.length;
5        int count = 0, even = 1, odd = 0;
6        int sum = 0;
7
8        for(int i = 0; i < n; i++){
9            sum += arr[i];
10
11            if(sum%2 == 1){
12                count = (count + even) % MOD;
13                odd++;
14            }
15            else{
16                count = (count + odd) % MOD;
17                even++;
18            }
19        }
20        return count;
21    }
22}
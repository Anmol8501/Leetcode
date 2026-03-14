// Last updated: 3/14/2026, 8:37:19 PM
1class Solution {
2    public int firstUniqueEven(int[] nums) {
3        int[] count =new int[101];
4        for(int n:nums){
5            if(n%2==0){
6                count[n]++;
7            }
8        }
9        for(int n:nums){
10            if(count[n]==1) return n;
11        }
12        return -1;
13    }
14}
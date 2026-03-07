// Last updated: 3/7/2026, 10:37:18 PM
1class Solution {
2    public int reverseDegree(String s) {
3        int k=0;
4        int sum=0;
5        for(int i=0;i<s.length();i++){
6            k='z'-s.charAt(i)+1;
7            int prod=k*(i+1);
8            sum+=prod;
9        }
10        return sum;
11    }
12}
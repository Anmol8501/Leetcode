// Last updated: 11/18/2026, 9:38:26 AM
1class Solution {
2    public int minChanges(String s) {
3        int n = s.length();
4        int count = 0;
5
6        for(int i = 1; i < n; i += 2){
7            if(s.charAt(i) != s.charAt(i-1)) 
8                count++;
9        }
10        return count;
11    }
12}
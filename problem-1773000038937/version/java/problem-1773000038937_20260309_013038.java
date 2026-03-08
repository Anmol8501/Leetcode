// Last updated: 3/9/2026, 1:30:38 AM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        String s1="";
4        for(int i=0;i<k;i++){
5            s1+=s.charAt(k-1-i);
6        }
7        for(int i=k;i<s.length();i++){
8            s1+=s.charAt(i);
9        }
10        return s1;
11    }
12}
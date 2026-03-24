// Last updated: 3/24/2026, 8:46:47 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int l=0,r=0;
4        while(l<s.length() && r<t.length()){
5            if(s.charAt(l)==t.charAt(r)){
6                l++;
7                r++;
8            }
9            else r++;
10        }
11    if(l==s.length()) return true;
12    return false;
13    }
14}
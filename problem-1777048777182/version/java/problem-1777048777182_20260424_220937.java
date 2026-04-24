// Last updated: 4/24/2026, 10:09:37 PM
1class Solution {
2    public String removeDuplicates(String s) {
3        StringBuilder res = new StringBuilder();
4
5        for(char c : s.toCharArray()) {
6            int n = res.length();
7            if(n > 0 && res.charAt(n - 1) == c) {
8                res.deleteCharAt(n - 1);
9            } else {
10                res.append(c);
11            }
12        }
13        return res.toString();
14    }
15}
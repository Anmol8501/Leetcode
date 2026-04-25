// Last updated: 4/25/2026, 12:17:08 PM
1class Solution {
2    public String removeDuplicates(String s) {
3        char[] stack = new char[s.length()];
4        int top = -1;
5
6        for (char c : s.toCharArray()) {
7            if (top >= 0 && stack[top] == c) {
8                top--;
9            } else {
10                stack[++top] = c;
11            }
12        }
13
14        return new String(stack, 0, top + 1);
15    }
16}
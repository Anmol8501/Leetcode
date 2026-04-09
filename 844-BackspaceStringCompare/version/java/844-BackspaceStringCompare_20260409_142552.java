// Last updated: 4/9/2026, 2:25:52 PM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Stack<Character> st=new Stack<>();
4        Stack<Character> st1=new Stack<>();
5        for(char ch:s.toCharArray()){
6            if(ch=='#' && !st.isEmpty()){
7                st.pop();
8            }
9            else if(ch=='#') continue;
10            else{
11                st.push(ch);
12            }
13        }
14        for(char ch:t.toCharArray()){
15            if(ch=='#' && !st1.isEmpty()){
16                st1.pop();
17            }
18            else if(ch=='#') continue;
19            else{
20                st1.push(ch);
21            }
22        }
23        while(!st.isEmpty() && !st1.isEmpty()){
24            if(st.pop()!=st1.pop()) return false;
25        }
26        return st.isEmpty() && st1.isEmpty();
27    }
28}
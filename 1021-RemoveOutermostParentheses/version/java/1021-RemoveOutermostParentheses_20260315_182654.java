// Last updated: 3/15/2026, 6:26:54 PM
1class Solution {
2    public String removeOuterParentheses(String s){
3        Stack<Character> stack=new Stack<>();
4        String res="";
5        for (int i=0;i<s.length();i++){
6            if (s.charAt(i)=='('){
7                if (!stack.isEmpty())
8                    res+=s.charAt(i);
9                stack.push(s.charAt(i));
10            }
11            else{
12                stack.pop();
13                if (!stack.isEmpty())
14                    res+=s.charAt(i);
15            }
16        }
17        return res;
18    }
19}
// Last updated: 3/15/2026, 6:13:51 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3         Stack<Character> stack = new Stack<>();
4        
5        String res = "";
6        for (int i = 0; i < s.length(); i++)
7        {
8            if (s.charAt(i) == '(')
9            {
10                if (!stack.isEmpty())
11                    res += s.charAt(i);
12                stack.push(s.charAt(i));
13            }
14            else
15            {
16                stack.pop();
17                if (!stack.isEmpty())
18                    res += s.charAt(i);
19            }
20        }
21        return res;
22    }
23}
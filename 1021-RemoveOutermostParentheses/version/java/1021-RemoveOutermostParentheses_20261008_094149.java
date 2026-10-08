// Last updated: 10/8/2026, 9:41:49 AM
1class Solution {
2    public String removeOuterParentheses(String s){
3        int key=0;
4        StringBuilder res=new StringBuilder();
5        for (char c:s.toCharArray()){
6            if (c=='('){
7                if (key!=0)
8                    res.append(c);
9                key++;
10            }
11            else{
12                key--;
13                if (key!=0)
14                    res.append(c);
15            }
16        }
17        return res.toString();
18    }
19}
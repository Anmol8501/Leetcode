// Last updated: 4/9/2026, 8:59:29 AM
1class Solution {
2    public boolean isValid(String s) {
3        if(s.length()%2!=0) return false;
4        Stack<Character> stack=new Stack();
5        for(char ch:s.toCharArray()){
6            if(ch=='{' || ch=='[' || ch=='('){
7                stack.push(ch);
8            }
9            else{
10                if(stack.isEmpty()) return false;
11                char top=stack.peek();
12                if(stack.peek()=='('&&ch==')' || stack.peek()=='{'&&ch=='}' || stack.peek()=='['&&ch==']') stack.pop();
13            
14            else return false;
15        }}
16        return stack.isEmpty();
17        
18    }
19}
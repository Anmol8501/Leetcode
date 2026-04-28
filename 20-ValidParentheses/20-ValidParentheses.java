// Last updated: 4/28/2026, 8:03:49 PM
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> stack=new Stack();
        for(char ch:s.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                char top=stack.peek();
                if(stack.peek()=='('&&ch==')' || stack.peek()=='{'&&ch=='}' || stack.peek()=='['&&ch==']') stack.pop();
            
            else return false;
        }}
        return stack.isEmpty();
        
    }
}
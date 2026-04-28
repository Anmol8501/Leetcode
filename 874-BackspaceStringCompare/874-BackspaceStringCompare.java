// Last updated: 4/28/2026, 8:02:21 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        Stack<Character> st1=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#' && !st.isEmpty()){
                st.pop();
            }
            else if(ch=='#') continue;
            else{
                st.push(ch);
            }
        }
        for(char ch:t.toCharArray()){
            if(ch=='#' && !st1.isEmpty()){
                st1.pop();
            }
            else if(ch=='#') continue;
            else{
                st1.push(ch);
            }
        }
        while(!st.isEmpty() && !st1.isEmpty()){
            if(st.pop()!=st1.pop()) return false;
        }
        return st.isEmpty() && st1.isEmpty();
    }
}
// Last updated: 4/24/2026, 12:29:01 PM
1class Solution {
2    public String removeDuplicates(String s) {
3        Stack<Character> st=new Stack<>();
4        for(char ch:s.toCharArray()){
5            char top='.';
6            if(!st.isEmpty()) top=st.peek();
7            if(top!=ch) st.push(ch);
8            else st.pop();
9        }
10        String a="";
11        while(!st.isEmpty()){
12            a+=st.pop();
13        }
14        String b="";
15        for(int i=a.length()-1;i>=0;i--){
16            b+=a.charAt(i);
17        }
18        return b;
19    }
20}
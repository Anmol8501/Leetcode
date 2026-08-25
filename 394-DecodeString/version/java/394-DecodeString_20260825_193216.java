// Last updated: 8/25/2026, 7:32:16 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> num = new Stack<>();
4        Stack<String> str = new Stack<>();
5        String ans="";
6        int currentNum = 0;
7
8        for(char ch : s.toCharArray()){
9
10            if(ch-'0'>=0 && ch-'0'<10){
11                currentNum = currentNum * 10 + (ch - '0');   
12            }
13
14            else if(ch=='['){
15            num.push(currentNum);
16            currentNum=0;
17            str.push("[");
18            }
19
20            else if(ch!=']')
21                str.push(String.valueOf(ch));
22            
23            else{
24                String half="";
25                while(!str.peek().equals("[")){
26                    half = str.pop() + half;
27                }
28
29                str.pop();
30                String decoded="";
31                int n=num.pop();
32
33                for(int i=0;i<n;i++){
34                    decoded+=half;
35                }
36                str.push(decoded);
37            }
38        }
39
40        while(!str.isEmpty()) {
41            ans = str.pop() + ans;
42        }
43
44        return ans;
45    }
46}
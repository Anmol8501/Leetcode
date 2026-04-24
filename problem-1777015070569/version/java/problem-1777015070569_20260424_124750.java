// Last updated: 4/24/2026, 12:47:50 PM
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> st = new Stack<>();
4        int sum = 0;
5
6        for (String s : operations) {
7            if (s.equals("+")) {
8                int a = st.pop();
9                int b = st.peek();
10                st.push(a);
11                st.push(a + b);
12            }
13            else if (s.equals("C")) {
14                st.pop();
15            }
16            else if (s.equals("D")) {
17                st.push(2 * st.peek());
18            }
19            else {
20                st.push(Integer.parseInt(s));
21            }
22        }
23        while (!st.isEmpty()) {
24            sum += st.pop();
25        }
26        return sum;
27    }
28}
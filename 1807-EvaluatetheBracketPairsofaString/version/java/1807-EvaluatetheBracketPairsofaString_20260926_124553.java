// Last updated: 9/26/2026, 12:45:53 PM
1class Solution {
2    public String evaluate(String s, List<List<String>> knowledge) {
3        HashMap<String, String> map = new HashMap<>();
4
5        for (List<String> list : knowledge)
6            map.put(list.get(0), list.get(1));
7
8        String ans = "";
9        String a = "";
10        boolean add = false;
11
12        for (char ch : s.toCharArray()) {
13            if (ch == '(') {
14                add = true;
15                a = "";
16            } 
17            else if (ch == ')') {
18                add = false;
19                ans += map.getOrDefault(a, "?");
20            } 
21            else if (add) {
22                a += ch;
23            } 
24            else {
25                ans += ch;
26            }
27        }
28        return ans;
29    }
30}
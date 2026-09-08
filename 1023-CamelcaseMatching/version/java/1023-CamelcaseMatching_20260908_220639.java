// Last updated: 9/8/2026, 10:06:39 PM
1class Solution {
2    public List<Boolean> camelMatch(String[] queries, String pattern) {
3        ArrayList<Boolean> list = new ArrayList<>();
4
5        for (String s : queries) {
6            int j = 0;
7            boolean ok = true;
8
9            for (char ch : s.toCharArray()) {
10                if (j < pattern.length() && ch == pattern.charAt(j)) {
11                    j++;
12                } else if (ch >= 'A' && ch <= 'Z') {
13                    ok = false;
14                    break;
15                }
16            }
17
18            if (j != pattern.length()) {
19                ok = false;
20            }
21
22            list.add(ok);
23        }
24
25        return list;
26    }
27}
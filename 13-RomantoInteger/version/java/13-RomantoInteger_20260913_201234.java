// Last updated: 9/13/2026, 8:12:34 PM
1class Solution {
2    public int romanToInt(String s) {
3        Map<Character, Integer> map = Map.of(
4            'I', 1, 'V', 5, 'X', 10,
5            'L', 50, 'C', 100, 'D', 500, 'M', 1000
6        );
7
8        int result = 0;
9        for (int i = 0; i < s.length(); i++) {
10            int curr = map.get(s.charAt(i));
11            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;
12
13            if (curr < next) {
14                result -= curr;
15            } else {
16                result += curr;
17            }
18        }
19
20        return result;
21    }
22}
23
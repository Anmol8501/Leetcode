// Last updated: 3/26/2026, 11:16:25 AM
1class Solution {
2    public int compress(char[] chars) {
3        int i=0,index=0;
4        while (i < chars.length) {
5            char curr = chars[i];
6            int count = 0;
7            while (i < chars.length && chars[i] == curr) {
8                i++;
9                count++;
10            }
11            chars[index++] = curr;
12
13            if (count > 1) {
14                String num = String.valueOf(count);
15                for (char c : num.toCharArray()) {
16                    chars[index++] = c;
17                }
18            }
19        }
20
21        return index;
22    }
23}
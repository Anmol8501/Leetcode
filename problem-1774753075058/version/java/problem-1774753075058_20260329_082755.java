// Last updated: 3/29/2026, 8:27:55 AM
1import java.util.Objects;
2
3public class Solution {
4
5    public int firstMatchingIndex(String s) {
6        // Input validation
7        if (s == null) {
8            throw new IllegalArgumentException("Input string cannot be null");
9        }
10
11        int n = s.length();
12
13        if (n == 0) {
14            return -1;
15        }
16
17        for (int i = 0; i < n; i++) {
18            if (s.charAt(i) == s.charAt(n - i - 1)) {
19                return i;
20            }
21        }
22
23        return -1;
24    }
25
26    public static void main(String[] args) {
27        Solution sol = new Solution();
28
29        assert sol.firstMatchingIndex("abcacbd") == 1 : "Test case 1 failed";
30        assert sol.firstMatchingIndex("abc") == 1 : "Test case 2 failed";
31
32        assert sol.firstMatchingIndex("a") == 0 : "Single character failed";
33        assert sol.firstMatchingIndex("") == -1 : "Empty string failed";
34
35        assert sol.firstMatchingIndex("abcd") == -1 : "No match failed";
36
37        assert sol.firstMatchingIndex("aaaa") == 0 : "All same failed";
38
39        assert sol.firstMatchingIndex("racecar") == 0 : "Palindrome failed";
40
41        StringBuilder sb = new StringBuilder();
42        for (int i = 0; i < 100000; i++) sb.append('a');
43        String large = sb.toString();
44        assert sol.firstMatchingIndex(large) == 0 : "Large input failed";
45
46        assert sol.firstMatchingIndex("abxyba") == 0 : "Mixed case failed";
47
48        try {
49            sol.firstMatchingIndex(null);
50            throw new AssertionError("Null input test failed");
51        } catch (IllegalArgumentException e) {
52        }
53
54        System.out.println("All test cases passed ✅");
55    }
56}
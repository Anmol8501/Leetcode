// Last updated: 3/29/2026, 8:14:17 AM
1import java.util.*;
2
3public class Solution {
4
5    public int sortableIntegers(int[] nums) {
6        // Input validation
7        if (nums == null || nums.length == 0) {
8            return 0;
9        }
10
11        int n = nums.length;
12
13        // Create sorted version
14        int[] sorted = Arrays.copyOf(nums, n);
15        Arrays.sort(sorted);
16
17        int result = 0;
18
19        // Find all divisors of n
20        List<Integer> divisors = getDivisors(n);
21
22        for (int k : divisors) {
23            if (isValidK(nums, sorted, k)) {
24                result += k;
25            }
26        }
27
28        return result;
29    }
30
31    // Get all divisors of n
32    private List<Integer> getDivisors(int n) {
33        List<Integer> divisors = new ArrayList<>();
34        for (int i = 1; i * i <= n; i++) {
35            if (n % i == 0) {
36                divisors.add(i);
37                if (i != n / i) {
38                    divisors.add(n / i);
39                }
40            }
41        }
42        return divisors;
43    }
44
45    // Check if k is valid
46    private boolean isValidK(int[] nums, int[] sorted, int k) {
47        int n = nums.length;
48        int blocks = n / k;
49
50        for (int b = 0; b < blocks; b++) {
51            int start = b * k;
52
53            int[] block = new int[k];
54            int[] target = new int[k];
55
56            for (int i = 0; i < k; i++) {
57                block[i] = nums[start + i];
58                target[i] = sorted[start + i];
59            }
60
61            if (!isRotation(block, target)) {
62                return false;
63            }
64        }
65
66        return true;
67    }
68
69    // Check if target is rotation of block using KMP
70    private boolean isRotation(int[] block, int[] target) {
71        int k = block.length;
72
73        // Create doubled array
74        int[] doubled = new int[2 * k];
75        for (int i = 0; i < k; i++) {
76            doubled[i] = block[i];
77            doubled[i + k] = block[i];
78        }
79
80        return kmpSearch(doubled, target);
81    }
82
83    // KMP search for int arrays
84    private boolean kmpSearch(int[] text, int[] pattern) {
85        int[] lps = buildLPS(pattern);
86
87        int i = 0, j = 0;
88
89        while (i < text.length) {
90            if (text[i] == pattern[j]) {
91                i++;
92                j++;
93                if (j == pattern.length) {
94                    return true;
95                }
96            } else {
97                if (j != 0) {
98                    j = lps[j - 1];
99                } else {
100                    i++;
101                }
102            }
103        }
104
105        return false;
106    }
107
108    // Build LPS array for KMP
109    private int[] buildLPS(int[] pattern) {
110        int n = pattern.length;
111        int[] lps = new int[n];
112
113        int len = 0;
114        int i = 1;
115
116        while (i < n) {
117            if (pattern[i] == pattern[len]) {
118                len++;
119                lps[i] = len;
120                i++;
121            } else {
122                if (len != 0) {
123                    len = lps[len - 1];
124                } else {
125                    lps[i] = 0;
126                    i++;
127                }
128            }
129        }
130
131        return lps;
132    }
133
134    // ============================
135    // ✅ UNIT TESTS
136    // ============================
137    public static void main(String[] args) {
138        Solution sol = new Solution();
139
140        // Test 1
141        int[] nums1 = {3, 1, 2};
142        System.out.println(sol.sortableIntegers(nums1)); // Expected: 3
143
144        // Test 2: Already sorted
145        int[] nums2 = {1, 2, 3, 4};
146        System.out.println(sol.sortableIntegers(nums2)); // Expected: sum of all divisors = 1+2+4=7
147
148        // Test 3: Reverse
149        int[] nums3 = {4, 3, 2, 1};
150        System.out.println(sol.sortableIntegers(nums3));
151
152        // Test 4: Single element
153        int[] nums4 = {10};
154        System.out.println(sol.sortableIntegers(nums4)); // Expected: 1
155
156        // Test 5: All same elements
157        int[] nums5 = {2, 2, 2, 2};
158        System.out.println(sol.sortableIntegers(nums5)); // Expected: 1+2+4=7
159
160        // Test 6: Large mixed
161        int[] nums6 = {5, 1, 3, 2, 4};
162        System.out.println(sol.sortableIntegers(nums6));
163
164        // Edge Case: empty
165        int[] nums7 = {};
166        System.out.println(sol.sortableIntegers(nums7)); // Expected: 0
167
168        // Edge Case: null
169        System.out.println(sol.sortableIntegers(null)); // Expected: 0
170    }
171}
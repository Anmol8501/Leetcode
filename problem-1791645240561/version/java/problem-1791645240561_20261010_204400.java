// Last updated: 10/10/2026, 8:44:00 PM
1class Solution {
2    public int[] maxProductPair(int[] nums, int target) {
3
4        int n = nums.length;
5        int maxProduct = Integer.MIN_VALUE;
6        int ansI = -1;
7        int ansJ = -1;
8
9        for (int i = 0; i < n; i++) {
10            for (int j = 0; j < n; j++) {
11                if (i != j &&
12                    nums[i] + nums[j] == target &&
13                    nums[i] > nums[j]) {
14
15                    int product = nums[i] * nums[j];
16                    if (product > maxProduct) {
17                        maxProduct = product;
18                        ansI = i;
19                        ansJ = j;
20                    }
21                }
22            }
23        }
24
25        return new int[]{ansI, ansJ};
26    }
27}
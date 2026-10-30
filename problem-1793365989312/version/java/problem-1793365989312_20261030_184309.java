// Last updated: 10/30/2026, 6:43:09 PM
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int left = 0, right = nums.length - 1;
4
5        while (left < right) {
6
7            while (left < right && nums[left] % 2 == 0) {
8                left++;
9            }
10
11            while (left < right && nums[right] % 2 != 0) {
12                right--;
13            }
14
15            if (left < right) {
16                int temp = nums[left];
17                nums[left] = nums[right];
18                nums[right] = temp;
19
20                left++;
21                right--;
22            }
23        }
24
25        return nums;
26    }
27}
// Last updated: 10/30/2026, 6:42:17 PM
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int left = 0, right = nums.length-1;
4
5        while(left < right){
6            while(nums[left]%2==0 && left < right) left++;
7            while(nums[right]%2!=0 && right > left) right--;
8
9            int temp = nums[left];
10            nums[left] = nums[right];
11            nums[right] = temp;
12            right--;
13            left++;
14        }
15        return nums;
16    }
17}
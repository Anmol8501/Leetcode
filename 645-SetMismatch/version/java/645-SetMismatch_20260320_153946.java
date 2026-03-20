// Last updated: 3/20/2026, 3:39:46 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3       int i = 0;
4        while (i < nums.length) {
5            int correctIdx = nums[i] - 1; 
6            if (nums[i] != nums[correctIdx]) {
7                swap(nums, i, correctIdx);
8            }
9            else i++;
10        }
11        for(int j=0;j<i;j++){
12            if(nums[j]!=j+1)
13            return new int[]{nums[j],j+1};
14        }
15        return new int[]{-1,-1};
16    }
17    public static void swap(int[] arr, int first, int second) {
18        int temp = arr[first];
19        arr[first] = arr[second];
20        arr[second] = temp;
21    } 
22}
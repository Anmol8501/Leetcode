// Last updated: 8/15/2026, 12:01:57 AM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5        while(left<=right){
6            int mid = left + (right-left)/2;
7            if(nums[mid] == target){
8                return mid;
9            }
10            else if(nums[mid]<target)
11              left = mid + 1;
12            else
13              right = mid - 1;
14        }   
15        return left;    
16    }
17}
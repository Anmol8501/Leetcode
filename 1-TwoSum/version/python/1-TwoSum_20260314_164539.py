# Last updated: 3/14/2026, 4:45:39 PM
1class Solution:
2    def twoSum(self, nums, target):
3        hashmap = {}
4
5        for i in range(len(nums)):
6            complement = target - nums[i]
7
8            if complement in hashmap:
9                return [hashmap[complement], i]
10
11            hashmap[nums[i]] = i
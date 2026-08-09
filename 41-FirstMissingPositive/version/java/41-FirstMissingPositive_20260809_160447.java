// Last updated: 8/9/2026, 4:04:47 PM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int missing=1;
4        Arrays.sort(nums);
5        int index=0;
6        while(index<nums.length && nums[index]<=0){
7            index++;
8        }
9        for(int i=index;i<nums.length;i++){
10            if(i>0 && nums[i]==nums[i-1]) continue;
11            else if(nums[i]!=missing) return missing;
12            else missing++;
13        }
14        return missing;
15    }
16}
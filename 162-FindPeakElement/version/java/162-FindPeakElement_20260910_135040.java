// Last updated: 9/10/2026, 1:50:40 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        if(nums.length<2) return 0;
4
5        int max=Integer.MIN_VALUE;
6        int index=0;
7        
8        for(int i=0;i<nums.length;i++){
9            if(nums[i]>max){
10                index=i;
11                max=nums[i];
12            }
13        }
14        return index;
15    }
16}
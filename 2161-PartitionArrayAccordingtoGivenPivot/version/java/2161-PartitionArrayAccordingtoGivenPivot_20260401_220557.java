// Last updated: 4/1/2026, 10:05:57 PM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int n=nums.length;
4        int[] arr=new int[n];
5        int index=0;
6        for(int i=0;i<n;i++){
7            if(nums[i]<pivot)
8            arr[index++]=nums[i];
9        }
10        for(int i=0;i<n;i++){
11            if(nums[i]==pivot)
12            arr[index++]=nums[i];
13        }
14        for(int i=0;i<n;i++){
15            if(nums[i]>pivot)
16            arr[index++]=nums[i];
17        }
18        return arr;
19    }
20}
// Last updated: 4/19/2026, 5:02:23 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n=nums.length;
4        int[] min=new int[n];
5        int m=1000000000;
6        for(int i=n-1;i>=0;i--){
7            if(m>nums[i]){
8                min[i]=nums[i];
9                m=nums[i];
10            }
11            else min[i]=m;
12        }
13        int max=nums[0];
14        for(int i=0;i<n;i++){
15            max=Math.max(max,nums[i]);
16            if(max-min[i]<=k) return i;
17        }
18        return -1;
19    }
20}
// Last updated: 8/29/2026, 9:47:52 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int n=nums.length;
4        int lsum=0,rsum=0;
5        for(int i=0;i<n;i++){
6           rsum+=nums[i];
7        }
8        for(int i=0;i<n;i++){
9            rsum-=nums[i];
10            if(lsum==rsum) return i;
11            lsum+=nums[i];
12        }
13        return -1;     
14    }
15}
// Last updated: 9/5/2026, 9:05:44 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4        int[] mins = new int[n];
5        mins[n-1] = nums[n-1];
6
7        for(int i=n-2;i>=0;i--){
8            mins[i] = Math.min(nums[i],mins[i+1]);
9        }
10
11        int maxn=0;
12
13        for(int i=0;i<n;i++){
14            maxn=Math.max(maxn,nums[i]);
15            if(maxn-mins[i]<=k) return i;
16        }
17        return -1;
18    }
19}
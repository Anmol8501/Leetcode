// Last updated: 9/5/2026, 8:48:10 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        
4        int n = nums.length;
5        int[] maxarr = new int[n];
6        int[] minarr = new int[n];
7
8        maxarr[0] = nums[0];
9        minarr[n-1] = nums[n-1];
10
11        for(int i=1;i<n;i++){
12            
13            if(nums[i]>maxarr[i-1]) maxarr[i] = nums[i];
14            else maxarr[i] = maxarr[i-1];
15
16            if(nums[n-1-i]<minarr[n-i]) minarr[n-i-1] = nums[n-1-i];
17            else minarr[n-1-i] = minarr[n-i];
18
19        }
20        for(int index=0;index<n;index++){
21
22            if(maxarr[index]-minarr[index]<=k) return index;
23        }
24        return -1;
25   }
26}
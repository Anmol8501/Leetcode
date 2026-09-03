// Last updated: 9/3/2026, 11:39:46 PM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        boolean alleven = true;
4        int minval = Integer.MAX_VALUE;
5
6        for(int val:nums1){
7            if(val%2!=0) alleven=false;
8            if(minval>val) minval=val;
9        }
10
11        return alleven || minval%2==1;
12    }
13}
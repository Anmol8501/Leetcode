// Last updated: 3/14/2026, 4:32:45 PM
1class Solution {
2    public int trap(int[] height) {
3        int ans=0;
4        int n=height.length;
5        int[] lmax=new int[n];
6        int[] rmax=new int[n];
7        lmax[0]=height[0];
8        rmax[n-1]=height[n-1];
9        for(int i=1;i<n;i++){
10            lmax[i]=Math.max(lmax[i-1],height[i]);
11            rmax[n-1-i]=Math.max(rmax[n-i],height[n-1-i]);
12        }
13        for(int i=0;i<n;i++){
14            ans+=Math.min(lmax[i],rmax[i])-height[i];
15        }
16        return ans;
17    }
18}
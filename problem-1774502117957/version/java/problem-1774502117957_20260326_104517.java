// Last updated: 3/26/2026, 10:45:17 AM
1class Solution {
2    public int findClosest(int x, int y, int z) {
3        int d1=Math.abs(x-z);
4        int d2=Math.abs(z-y);
5        if(d1==d2) return 0;
6        else if(d1<d2) return 1;
7        return 2;
8    }
9}
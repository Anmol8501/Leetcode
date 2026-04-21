// Last updated: 4/21/2026, 2:24:33 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int d1=Math.abs(x-z);
        int d2=Math.abs(z-y);
        if(d1==d2) return 0;
        else if(d1<d2) return 1;
        return 2;
    }
}
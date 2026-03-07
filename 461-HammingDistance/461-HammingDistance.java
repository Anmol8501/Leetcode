// Last updated: 3/7/2026, 10:13:03 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int dist=0;
        while(x!=0 || y!=0){
            int a=x&1;
            int b=y&1;
            dist+=(a^b);
            x=x>>1;
            y=y>>1;
        }
        return dist;
    }
}
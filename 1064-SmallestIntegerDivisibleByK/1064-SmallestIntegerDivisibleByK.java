// Last updated: 4/28/2026, 8:02:15 PM
class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0)
            return -1;
        int n=0;
        for(int i=1;i<k+1;i++){
            n=(n*10+1)%k;
            if(n==0) return i;
        }
        return -1;
    }
}
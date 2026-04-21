// Last updated: 4/21/2026, 2:24:17 PM
class Solution {
    public int mirrorDistance(int n) {
        
        return Math.abs(reverse(n)-n);
    }
    private int reverse(int n){
        int a=0;
        while(n>0){
            a=a*10+n%10;
            n/=10;
        }
        return a;
    }
}
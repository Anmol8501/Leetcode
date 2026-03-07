// Last updated: 3/7/2026, 10:13:42 PM
class Solution {
    public int hammingWeight(int n) {
        int a=1;
        while(n!=1){
            a=a+(n&1);
            n/=2;
        }
        return a;
    }
}
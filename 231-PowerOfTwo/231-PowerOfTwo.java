// Last updated: 3/7/2026, 10:13:38 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
         if(n <= 0) return false;
         boolean a=(n & (n - 1)) == 0;
        return a;
    }
}
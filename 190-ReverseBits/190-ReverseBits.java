// Last updated: 3/7/2026, 10:13:45 PM
class Solution {
    public int reverseBits(int n) {
        int a = 0;
        for (int i = 0; i < 32; i++) {
            a = a * 2 + (n & 1);
            n >>>= 1;
        }
        return a;
    }
}

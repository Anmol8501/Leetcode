// Last updated: 4/21/2026, 2:25:23 PM
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if (k == 0) return res;
        int windowSize = Math.abs(k);
        int sum = 0;
        for (int i = 1; i <= windowSize; i++) {
            int idx = (k > 0) ? i : n - i;
            sum += code[idx];
        }
        for (int i = 0; i < n; i++) {
            res[i] = sum;
            int removeIdx = (k > 0) ? (i + 1) % n : (i + n - windowSize) % n;
            int addIdx = (k > 0) ? (i + 1 + windowSize) % n : i;
            sum -= code[removeIdx];
            sum += code[addIdx];
        }
        return res;
    }
}
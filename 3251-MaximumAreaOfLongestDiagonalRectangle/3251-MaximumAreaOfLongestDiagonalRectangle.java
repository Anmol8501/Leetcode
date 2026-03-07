// Last updated: 3/7/2026, 10:11:00 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag = 0;
        int maxArea = 0;

        for (int[] d : dimensions) {
            int diag = d[0]*d[0]+d[1]*d[1];
            int area = d[0]*d[1];

            if (diag > maxDiag) {
                maxDiag = diag;
                maxArea = area;
            } else if (diag == maxDiag) {
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}

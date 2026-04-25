// Last updated: 4/25/2026, 3:29:22 PM
class Solution {
    public int maxArea(int[] height) {
        int first = 0;
        int second = height.length - 1;
        int maxAmount = 0;
        // max Amount = distance * (shortest edge between the two found)

        while (first < second){
            int shortestHeight = Math.min(height[first], height[second]);
            int localMax = (second - first) * shortestHeight; 

            if (localMax > maxAmount){
                maxAmount = localMax;
            }

            if (height[first] > height[second]) {
                second--;
            } else {
                first++;
            }

        }

        return maxAmount;
    }
    
}
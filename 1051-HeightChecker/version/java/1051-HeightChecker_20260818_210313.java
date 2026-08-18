// Last updated: 8/18/2026, 9:03:13 PM
class Solution {
    public static int heightChecker(int[] heights) {
        // Find the maximum height to determine the size of the count array
        int max = heights[0];

        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }

        // Store the frequency of each height
        int[] countArray = new int[max + 1];

        for (int height : heights) {
            countArray[height]++;
        }

        // Reconstruct the sorted order using the frequency array
        // and compare it with the original array
        int mismatch = 0;
        int index = 0;

        for (int value = 0; value <=max; value++) {

            // Each occurrence of 'value' represents the next
            // expected element in the sorted array
            while (countArray[value] > 0) {

                // Compare the expected sorted value with the
                // value at the same position in the original array
                if (heights[index] != value) {
                    mismatch++;
                }

                index++;
                countArray[value]--;
            }
        }

        return mismatch;
    }
}
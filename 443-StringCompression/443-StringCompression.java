// Last updated: 4/28/2026, 8:02:43 PM
class Solution {
    public int compress(char[] chars) {
        int i=0,index=0;
        while (i < chars.length) {
            char curr = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == curr) {
                i++;
                count++;
            }
            chars[index++] = curr;

            if (count > 1) {
                String num = String.valueOf(count);
                for (char c : num.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}
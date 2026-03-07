// Last updated: 3/7/2026, 10:18:33 PM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int num = Character.getNumericValue(coordinates.charAt(1));
        char c=coordinates.charAt(0);
        return ((c+num)%2!=0);
    }
}
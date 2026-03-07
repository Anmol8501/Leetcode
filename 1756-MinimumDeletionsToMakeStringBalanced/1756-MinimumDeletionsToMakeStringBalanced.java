// Last updated: 3/7/2026, 10:18:53 PM
class Solution {
    public int minimumDeletions(String s) {
        int counta = 0, countb = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') counta++;
        }
        //if (counta == 0 || counta == s.length()) return 0;
        int mindelete = counta;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') counta--;
            else countb++;
            mindelete = Math.min(mindelete, counta + countb);
        }
        return mindelete;
    }
}

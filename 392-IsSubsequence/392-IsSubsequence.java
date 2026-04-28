// Last updated: 4/28/2026, 8:02:47 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=0,r=0;
        while(l<s.length() && r<t.length()){
            if(s.charAt(l)==t.charAt(r)){
                l++;
                r++;
            }
            else r++;
        }
    if(l==s.length()) return true;
    return false;
    }
}
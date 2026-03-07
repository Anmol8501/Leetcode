// Last updated: 3/7/2026, 10:14:15 PM
class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder s=new StringBuilder(haystack);
        return s.indexOf(needle);
    }
}
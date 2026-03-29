// Last updated: 3/29/2026, 5:39:53 PM
1class Solution {
2    public boolean canBeEqual(String s1, String s2) {
3        return (((s1.charAt(0)==s2.charAt(0) && s1.charAt(2)==s2.charAt(2)) || (s1.charAt(0)==s2.charAt(2) && s1.charAt(2)==s2.charAt(0))) && ((s1.charAt(1)==s2.charAt(1) && s1.charAt(3)==s2.charAt(3)) || (s1.charAt(1)==s2.charAt(3) && s1.charAt(3)==s2.charAt(1))));
4    }
5}
// Last updated: 3/7/2026, 10:31:03 PM
/*
 * Time Complexity-O(n)
 * Space Complexity-O(n)
*/

1class Solution {
2    public int scoreOfString(String s) {
3        int next=0;
4        int first=s.charAt(0);
5        int sum=0;
6        for(int i=1;i<s.length();i++){
7            next=s.charAt(i);
8            sum+=Math.abs(first-next);
9            first=next;
10        }
11        return sum;
12    }
13}
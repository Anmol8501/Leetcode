// Last updated: 8/21/2026, 11:53:39 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        String s=String.valueOf(x);
4        int left=0,right=s.length()-1;
5
6        while(left<right){
7            if(s.charAt(left)!=s.charAt(right)) return false;
8            left++;
9            right--;
10        }
11        return true;
12    }
13}
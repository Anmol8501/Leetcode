// Last updated: 4/15/2026, 9:29:06 PM
1class Solution {
2    public int closestTarget(String[] words, String target, int startIndex) {
3        int n=0;
4        int j=words.length;
5        while(n<j/2+1){
6            if(words[(startIndex+j-n)%j].equals(target)) return n;
7            else if(words[(startIndex+n)%j].equals(target)) return n;
8            n++;
9        }
10        return -1;
11    }
12}
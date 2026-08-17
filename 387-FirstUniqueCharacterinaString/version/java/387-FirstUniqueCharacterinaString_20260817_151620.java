// Last updated: 8/17/2026, 3:16:20 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] freq = new int[26];
4        for(char ch:s.toCharArray()){
5            freq[ch-'a']++;
6        }
7        int i=0;
8        for(char ch:s.toCharArray()){
9            if(freq[ch-'a']==1)
10                return i;
11            i++;
12        }
13        return -1;
14    }
15}
// Last updated: 8/17/2026, 10:55:27 AM
1class Solution {
2    public int firstUniqChar(String s) {
3        HashMap<Character, Integer> map = new HashMap<>();
4        for(char ch:s.toCharArray()){
5            map.put(ch, map.getOrDefault(ch, 0)+1);
6        }
7        for(int i=0;i<s.length();i++){
8            if(map.get(s.charAt(i))==1)
9                return i;
10        }
11        return -1;
12    }
13}
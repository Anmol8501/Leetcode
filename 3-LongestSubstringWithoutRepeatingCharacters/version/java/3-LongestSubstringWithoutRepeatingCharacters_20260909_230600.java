// Last updated: 9/9/2026, 11:06:00 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n = s.length();
4        HashMap<Character, Integer> charMap = new HashMap<>();
5        int maxlen = 0;
6        int left = 0;
7
8        for(int i=0;i<n;i++){
9            if(!charMap.containsKey(s.charAt(i)) || charMap.get(s.charAt(i)) < left){
10                charMap.put(s.charAt(i),i);
11                maxlen = Math.max(maxlen,i-left+1);
12            }
13            else{
14                left = charMap.get(s.charAt(i))+1;
15                charMap.put(s.charAt(i),i);
16            }
17        }
18        return maxlen;
19    }
20}
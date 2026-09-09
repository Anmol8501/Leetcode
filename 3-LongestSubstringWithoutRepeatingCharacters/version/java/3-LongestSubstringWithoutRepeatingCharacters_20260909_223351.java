// Last updated: 9/9/2026, 10:33:51 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n = s.length();
4        HashSet<Character> charset = new HashSet<>();
5        int maxlen = 0;
6        int left = 0;
7
8        for(int i=0;i<n;i++){
9            if(!charset.contains(s.charAt(i))){
10                charset.add(s.charAt(i));
11                maxlen = Math.max(maxlen,i-left+1);
12            }
13            else{
14                while(charset.contains(s.charAt(i))){
15                    charset.remove(s.charAt(left));
16                    left++;
17                }
18                charset.add(s.charAt(i));
19            }
20        }
21        return maxlen;
22    }
23}
// Last updated: 8/4/2026, 8:51:34 PM
1class Solution {
2    public String defangIPaddr(String address) {
3        char[] s = address.toCharArray();
4        String ans="";
5        for(char ch:s){
6            if(ch=='.'){
7                ans=ans+"[.]";
8            }
9            else ans=ans+ch;
10        }
11        return ans;
12    }
13}
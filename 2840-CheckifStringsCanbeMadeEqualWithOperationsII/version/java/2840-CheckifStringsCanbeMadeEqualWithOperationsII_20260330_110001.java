// Last updated: 3/30/2026, 11:00:01 AM
1class Solution {
2    public boolean checkStrings(String s1, String s2) {
3        int[] odd=new int[26];
4        int[] even=new int[26];
5        for(int i=0;i<s1.length();i++){
6            if(i%2==0) even[(int)(s1.charAt(i)-'a')]++;
7            else odd[(int)(s1.charAt(i)-'a')]++;
8        }
9        for(int i=0;i<s2.length();i++){
10            if(i%2==0) even[(int)(s2.charAt(i)-'a')]--;
11            else odd[(int)(s2.charAt(i)-'a')]--;
12        }
13        for(int i=0;i<26;i++){
14            if(even[i]!=0 || odd[i]!=0) return false;
15    }
16    return true;
17    }
18}
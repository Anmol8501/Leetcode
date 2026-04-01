// Last updated: 4/1/2026, 9:47:09 PM
1class Solution {
2    public int maxDistinct(String s) {
3        boolean[] arr=new boolean[26];
4        int count=0;
5        for(char ch:s.toCharArray()){
6            arr[ch-'a']=true;
7        }
8        for(int i=0;i<26;i++){
9            if(arr[i]) count++;
10        }
11        return count;
12    }
13}
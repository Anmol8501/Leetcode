// Last updated: 4/21/2026, 2:24:26 PM
class Solution {
    public int maxDistinct(String s) {
        int[] arr=new int[26];
        int count=0;
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0) count++;
        }
        return count;
    }
}
// Last updated: 3/7/2026, 10:10:32 PM
class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        int maxvow=0,maxcons=0;
        for(char c:s.toCharArray()){
            int i=c-'a';
            freq[i]++;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')maxvow=Math.max(maxvow,freq[i]);
            else maxcons=Math.max(maxcons,freq[i]);
        }
        return maxvow+maxcons;
    }
}
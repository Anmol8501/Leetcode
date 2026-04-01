// Last updated: 4/1/2026, 9:48:43 PM
class Solution {
    public int maxDistinct(String s) {
        int[] hash = new int[26];
        int ans = 0;
        for(int i = 0; i < s.length(); i++) hash[s.charAt(i) - 'a']++;
        for(int i = 0; i < 26; i++) {
            if(hash[i] != 0) ans++;
        }
        return ans;
    }
}
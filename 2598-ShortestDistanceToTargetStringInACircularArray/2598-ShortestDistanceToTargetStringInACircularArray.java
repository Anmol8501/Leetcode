// Last updated: 4/21/2026, 2:24:54 PM
class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=0;
        int j=words.length;
        while(n<j/2+1){
            if(words[(startIndex+j-n)%j].equals(target)) return n;
            else if(words[(startIndex+n)%j].equals(target)) return n;
            n++;
        }
        return -1;
    }
}
// Last updated: 4/21/2026, 2:24:04 PM
class Solution {
    public int firstMatchingIndex(String s) {
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)) return i;
            i++;
            j--;
        }
        return -1;
    }
}
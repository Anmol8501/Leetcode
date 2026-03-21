// Last updated: 3/21/2026, 8:49:10 PM
class Solution {
    public int scoreOfString(String s) {
        int next=0;
        int first=s.charAt(0);
        int sum=0;
        for(int i=1;i<s.length();i++){
            next=s.charAt(i);
            sum+=Math.abs(first-next);
            first=next;
        }
        return sum;
    }
}
// Last updated: 3/7/2026, 10:12:39 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        s=s+s;
        if(s.length()/2==goal.length())return(s.contains(goal));
        return false;
    }
}
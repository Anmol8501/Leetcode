// Last updated: 3/7/2026, 10:17:59 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n=0;
        for(String s:operations){
            if(s.contains("+")) n++;
            else n--;
        }
        return n;
    }
}
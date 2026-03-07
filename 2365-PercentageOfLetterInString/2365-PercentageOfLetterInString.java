// Last updated: 3/7/2026, 10:11:24 PM
class Solution {
    public int percentageLetter(String s, char letter) {
        int b=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==letter){
                b++;
            }
        }
        return b*100/n;
    }
}
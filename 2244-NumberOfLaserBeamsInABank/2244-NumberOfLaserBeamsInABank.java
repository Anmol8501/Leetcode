// Last updated: 3/7/2026, 10:17:48 PM
class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0;
        int laser=0;
        for(String i:bank){
            int led=0;
            for(char c:i.toCharArray()){
                if(c=='1') led++;
            }
            if(led!=0){
                laser+=prev*led;
                prev=led;
            }
        }
        return laser;
    }
}
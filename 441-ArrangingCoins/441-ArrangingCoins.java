// Last updated: 3/7/2026, 10:13:08 PM
class Solution {
    public int arrangeCoins(int n) {
        int i=0;
        while(n>i){
            i++;
            n-=i;
        }
        
    return i;}
}
// Last updated: 4/28/2026, 8:03:12 PM
class Solution {
    public int trailingZeroes(int n) {
       int count=0;
       while(n>0){
        n/=5;
        count+=n;
       }
       return count;
    }
}
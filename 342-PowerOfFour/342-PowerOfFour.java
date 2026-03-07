// Last updated: 3/7/2026, 10:13:17 PM
class Solution {
    public boolean isPowerOfFour(int n) {
       while(n>1){
           if(n%4==0){
              n/=4; 
           }
           else return false;
       }
        if(n==1) return true;
        return false;
    }
}
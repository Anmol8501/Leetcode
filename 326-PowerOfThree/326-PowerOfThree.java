// Last updated: 3/7/2026, 10:13:20 PM
class Solution {
    public boolean isPowerOfThree(int n) {
     while(n%3==0 && n>2){
          n/=3;
      }
        if (n==1)
        return true;
        return false;   
    }
}
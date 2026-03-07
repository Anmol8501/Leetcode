// Last updated: 3/7/2026, 10:14:24 PM
class Solution {
    public boolean isPalindrome(int x) {
            int a=0;
        int c;
        int j=x;
        if (x<0){
            return false;
        }
        
    
        else{
            while(x!=0){
                 c=x%10;
                 a=a*10+c;
                 x/=10;
            }
            if(j==a){
                return true;
            } else{
                return false;
            }
        }
    }
}
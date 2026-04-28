// Last updated: 4/28/2026, 7:58:28 PM
class Solution {
    public boolean validDigit(int n, int x) {
        int a=10;
        boolean bool=false;
        while(n!=0){
            if(a==x) bool=true;
            a=n%10;
            n/=10;
        }
        return bool && (x!=a);
    }
}
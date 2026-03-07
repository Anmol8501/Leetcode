// Last updated: 3/7/2026, 10:12:31 PM
class Solution {
    public int fib(int n) {
        int first=0,second=1;
        int last=0;
        if(n<2) return n;
        for(int i=1;i<n;i++){
            last=first+second;
            first=second;
            second=last;
        }
        return last;
    }
}
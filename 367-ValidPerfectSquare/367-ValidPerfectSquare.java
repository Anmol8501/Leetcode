// Last updated: 3/7/2026, 10:13:13 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2) return true;
        else {long start=0;
        long end=(long)num/2;
        while(start<=end){
            long mid=start+(end-start)/2;
            if (mid*mid==num) return true;
            else if(mid*mid<num) start=mid+1;
            else end=mid-1;
        }}
        return false;
    }
}
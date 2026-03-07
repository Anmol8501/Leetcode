// Last updated: 3/7/2026, 10:13:01 PM
class Solution {
    public int findComplement(int num) {
        int rem,ans=0;
        int mul = 1;
        if(num==0) return 1;
        else{
        while(num!=0)
        {
            rem=num%2;
            rem=rem^1;
            num=num/2;
            ans=ans+rem*mul;
            mul=mul*2;
        }}
        return ans;
    }
}
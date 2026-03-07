// Last updated: 3/7/2026, 10:12:17 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int p=1;
        int a=0;
        while(n!=0){
           a=n%10;
           sum=sum+a;
           p=p*a;
           n=n/10;
        }
        int res=p-sum;
        return res;
    }
}
// Last updated: 3/7/2026, 10:10:43 PM
class Solution {
    public int smallestNumber(int n) {
        int i=0;
        int ans=0;
        int sum=0;
        int k=1;
        while(n!=0){
            n/=2;
            i=i*10+1;
        }
        while(i!=0){
            ans=k;
            k*=2;
            sum=sum+ans;
            i/=10;
        }
        return sum;
    }
}
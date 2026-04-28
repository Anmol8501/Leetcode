// Last updated: 4/28/2026, 8:02:49 PM
class Solution {
    public int getSum(int a, int b) {
       int sum=a^b;
       int carry=a&b;
       if(carry==0) return sum;
       return getSum(sum,carry<<1);
    }
}
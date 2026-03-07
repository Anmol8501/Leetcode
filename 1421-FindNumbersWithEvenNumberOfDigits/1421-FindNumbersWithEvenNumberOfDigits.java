// Last updated: 3/7/2026, 10:12:16 PM
class Solution {
    public int findNumbers(int[] nums) {
       
        int a=0;
        for(int num:nums){
             int n=0;
            while(num!=0){
                num=num/10;
                n++;
            }
            if(n!=0){
            if(n%2==0){a++;}}
        }
        return a;

    }
}
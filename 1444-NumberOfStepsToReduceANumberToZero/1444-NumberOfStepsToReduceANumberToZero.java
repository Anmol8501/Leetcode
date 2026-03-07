// Last updated: 3/7/2026, 10:12:12 PM
class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
            if(num%2==0) num/=2;
            else num--;
            count++;
        }
        return count;
    }
}
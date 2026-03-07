// Last updated: 3/7/2026, 10:17:43 PM
class Solution {
    public int countOperations(int num1, int num2) {
        int i=0;
        while(!(num1==0||num2==0)){
            i++;
            if(num1<num2)num2=num2-num1;
            else num1=num1-num2;
        }
        return i;
    }
}
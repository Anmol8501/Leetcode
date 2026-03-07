// Last updated: 3/7/2026, 10:11:07 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0;i<hours.length;i++) {
            if(hours[i] >= target) {
                count ++;
            }
        }
        return count;
    }
}
// Last updated: 3/7/2026, 10:13:16 PM
class Solution {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        while(left<right){
            char str=s[left];
            s[left]=s[right];
            s[right]=str;
            left++;
            right--;
        }
    }
}
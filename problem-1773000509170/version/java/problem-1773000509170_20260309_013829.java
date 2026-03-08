// Last updated: 3/9/2026, 1:38:29 AM
class Solution {
    public String reversePrefix(String s, int k) {
        int i=0; k-=1;
        char arr[] = s.toCharArray();
        while(i<k){
            char t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;
            i++; k--;
        } return new String(arr);
    }
}
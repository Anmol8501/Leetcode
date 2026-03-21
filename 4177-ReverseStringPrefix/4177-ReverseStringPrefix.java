// Last updated: 3/21/2026, 8:48:53 PM
class Solution {
    public String reversePrefix(String s, int k) {
        int left=0,right=k-1;
        char[] arr=s.toCharArray();
        while(left<right){
            char ch=arr[left];
            arr[left]=arr[right];
            arr[right]=ch;
            left++;
            right--;
        }
        return new String(arr);
    }
}
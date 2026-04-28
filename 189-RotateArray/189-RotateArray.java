// Last updated: 4/28/2026, 8:03:10 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int shift=k%n;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int newcol=(i+shift)%n;
            arr[newcol]=nums[i];
        }
        for(int i=0;i<n;i++){
        nums[i]=arr[i];
    }}
}
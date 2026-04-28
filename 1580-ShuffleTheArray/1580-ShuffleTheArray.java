// Last updated: 4/28/2026, 8:01:53 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[2*n];
        int j=0;
        for(int i=0;i<n;i++){
            arr[j]=nums[i];
            j++;
            arr[j]=nums[n+i];
            j++;
        }
    return arr;
    }
}
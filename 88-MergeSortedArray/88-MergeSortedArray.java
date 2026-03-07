// Last updated: 3/7/2026, 10:13:56 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m,j=0;j<n;j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        
    }
}
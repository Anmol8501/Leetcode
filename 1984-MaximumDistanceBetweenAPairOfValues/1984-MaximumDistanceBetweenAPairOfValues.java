// Last updated: 4/21/2026, 2:25:11 PM
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {

        int i,j;
        for(i=0, j=0; i<nums1.length && j<nums2.length; j++){
            
            if(nums1[i]>nums2[j]) i++;
        }
        
        return Math.max(0,j-1-i);
    }
}
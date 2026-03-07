// Last updated: 3/7/2026, 10:13:24 PM
class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
                swap(nums,i,correct);
            else i++;
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1)
                return nums[j];
        }
        return -1;
    }
    void swap(int[] arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}